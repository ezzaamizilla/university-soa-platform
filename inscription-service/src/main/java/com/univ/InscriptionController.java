package com.univ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/inscriptions")
public class InscriptionController {
    
    @Autowired
    private InscriptionRepository inscriptionRepository;
    
    // GET /inscriptions - Liste toutes les inscriptions
    @GetMapping
    public List<Inscription> getAllInscriptions() {
        return inscriptionRepository.findAll();
    }
    
    // POST /inscriptions - Créer une nouvelle inscription
    @PostMapping
    public String createInscription(@RequestBody Inscription inscription) {
        inscriptionRepository.save(inscription);
        return "✅ Inscription créée avec succès pour l'étudiant " + inscription.getEtudiantId();
    }
    
    // GET /inscriptions/etudiant/{id} - Inscriptions d'un étudiant
    @GetMapping("/etudiant/{etudiantId}")
    public List<Inscription> getInscriptionsByEtudiant(@PathVariable String etudiantId) {
        return inscriptionRepository.findByEtudiantId(etudiantId);
    }
    
    // DELETE /inscriptions/{id} - Annuler une inscription
    @DeleteMapping("/{id}")
    public String cancelInscription(@PathVariable String id) {
        Inscription inscription = inscriptionRepository.findById(id);
        if (inscription != null) {
            inscription.setStatut("ANNULÉ");
            inscriptionRepository.save(inscription);
            return "✅ Inscription annulée";
        }
        return "❌ Inscription non trouvée";
    }
}