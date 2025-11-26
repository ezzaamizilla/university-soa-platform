package com.univ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/suivi")
public class SuiviController {
    
    @Autowired
    private SuiviRepository suiviRepository;
    
    // GET /suivi - Liste tous les suivis académiques
    @GetMapping
    public List<SuiviAcademique> getAllSuivis() {
        return suiviRepository.findAll();
    }
    
    // GET /suivi/etudiant/{etudiantId} - Suivi d'un étudiant spécifique
    @GetMapping("/etudiant/{etudiantId}")
    public List<SuiviAcademique> getSuiviByEtudiant(@PathVariable String etudiantId) {
        return suiviRepository.findByEtudiantId(etudiantId);
    }
    
    // GET /suivi/etudiant/{etudiantId}/valides - Cours validés d'un étudiant
    @GetMapping("/etudiant/{etudiantId}/valides")
    public List<SuiviAcademique> getCoursValides(@PathVariable String etudiantId) {
        return suiviRepository.findByEtudiantIdAndStatut(etudiantId, "VALIDÉ");
    }
    
    // POST /suivi - Créer un nouveau suivi (inscription à un cours)
    @PostMapping
    public String creerSuivi(@RequestBody SuiviAcademique suivi) {
        suiviRepository.save(suivi);
        return "✅ Suivi académique créé pour l'étudiant " + suivi.getEtudiantId();
    }
    
    // PUT /suivi/{id}/note - Mettre à jour la note d'un suivi
    @PutMapping("/{id}/note")
    public String mettreAJourNote(@PathVariable String id, @RequestBody NoteRequest request) {
        SuiviAcademique suivi = suiviRepository.findById(id);
        if (suivi != null) {
            suivi.setNote(request.getNote());
            if (request.getNote() >= 10) {
                suivi.setStatut("VALIDÉ");
                suivi.setDateFin(java.time.LocalDate.now().toString());
                suivi.setAttestationUrl("/attestations/" + id + ".pdf");
            } else {
                suivi.setStatut("ECHEC");
            }
            suiviRepository.save(suivi);
            return "✅ Note mise à jour pour le suivi " + id;
        }
        return "❌ Suivi non trouvé";
    }
    
    // GET /suivi/{id}/attestation - Générer une attestation
    @GetMapping("/{id}/attestation")
    public String genererAttestation(@PathVariable String id) {
        SuiviAcademique suivi = suiviRepository.findById(id);
        if (suivi != null && "VALIDÉ".equals(suivi.getStatut())) {
            return "📄 Attestation de réussite disponible: " + suivi.getAttestationUrl();
        }
        return "❌ Aucune attestation disponible pour ce suivi";
    }
    
    // Classe pour la requête de note
    public static class NoteRequest {
        private double note;
        
        public double getNote() { return note; }
        public void setNote(double note) { this.note = note; }
    }
}