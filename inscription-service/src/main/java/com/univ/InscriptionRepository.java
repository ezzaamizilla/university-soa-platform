package com.univ;

import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class InscriptionRepository {
    private Map<String, Inscription> inscriptions = new HashMap<>();
    private int idCounter = 1;
    
    public InscriptionRepository() {
        // Données de test
        save(new Inscription("INS001", "2025001", "CS101", "2025-01-20"));
        save(new Inscription("INS002", "2025002", "MA201", "2025-01-21"));
    }
    
    public List<Inscription> findAll() {
        return new ArrayList<>(inscriptions.values());
    }
    
    public Inscription findById(String id) {
        return inscriptions.get(id);
    }
    
    public Inscription save(Inscription inscription) {
        if (inscription.getId() == null) {
            inscription.setId("INS" + (++idCounter));
        }
        inscriptions.put(inscription.getId(), inscription);
        return inscription;
    }
    
    public void delete(String id) {
        inscriptions.remove(id);
    }
    
    public List<Inscription> findByEtudiantId(String etudiantId) {
        List<Inscription> result = new ArrayList<>();
        for (Inscription ins : inscriptions.values()) {
            if (etudiantId.equals(ins.getEtudiantId())) {
                result.add(ins);
            }
        }
        return result;
    }
}