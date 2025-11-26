package com.univ;

import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class SuiviRepository {
    private Map<String, SuiviAcademique> suivis = new HashMap<>();
    private int idCounter = 1;
    
    public SuiviRepository() {
        // Données de test
        save(new SuiviAcademique("SUIVI001", "2025001", "CS101", "Algorithmique", "2025-01-15"));
        save(new SuiviAcademique("SUIVI002", "2025001", "MA201", "Mathématiques Avancées", "2025-01-16"));
        save(new SuiviAcademique("SUIVI003", "2025002", "CS101", "Algorithmique", "2025-01-15"));
        
        // Simuler un cours validé avec note
        SuiviAcademique suiviValide = new SuiviAcademique("SUIVI004", "2025003", "PH301", "Physique Quantique", "2024-09-01");
        suiviValide.setNote(16.5);
        suiviValide.setStatut("VALIDÉ");
        suiviValide.setDateFin("2024-12-20");
        suiviValide.setAttestationUrl("/attestations/SUIVI004.pdf");
        save(suiviValide);
    }
    
    public List<SuiviAcademique> findAll() {
        return new ArrayList<>(suivis.values());
    }
    
    public SuiviAcademique findById(String id) {
        return suivis.get(id);
    }
    
    public SuiviAcademique save(SuiviAcademique suivi) {
        if (suivi.getId() == null) {
            suivi.setId("SUIVI" + (++idCounter));
        }
        suivis.put(suivi.getId(), suivi);
        return suivi;
    }
    
    public List<SuiviAcademique> findByEtudiantId(String etudiantId) {
        List<SuiviAcademique> result = new ArrayList<>();
        for (SuiviAcademique suivi : suivis.values()) {
            if (etudiantId.equals(suivi.getEtudiantId())) {
                result.add(suivi);
            }
        }
        return result;
    }
    
    public List<SuiviAcademique> findByEtudiantIdAndStatut(String etudiantId, String statut) {
        List<SuiviAcademique> result = new ArrayList<>();
        for (SuiviAcademique suivi : suivis.values()) {
            if (etudiantId.equals(suivi.getEtudiantId()) && statut.equals(suivi.getStatut())) {
                result.add(suivi);
            }
        }
        return result;
    }
}