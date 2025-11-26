package com.univ;

public class Inscription {
    private String id;
    private String etudiantId;
    private String coursId;
    private String dateInscription;
    private String statut; // "CONFIRMÉ", "ANNULÉ"
    
    // Constructeurs
    public Inscription() {}
    
    public Inscription(String id, String etudiantId, String coursId, String dateInscription) {
        this.id = id;
        this.etudiantId = etudiantId;
        this.coursId = coursId;
        this.dateInscription = dateInscription;
        this.statut = "CONFIRMÉ";
    }
    
    // Getters/Setters...
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getEtudiantId() { return etudiantId; }
    public void setEtudiantId(String etudiantId) { this.etudiantId = etudiantId; }
    
    public String getCoursId() { return coursId; }
    public void setCoursId(String coursId) { this.coursId = coursId; }
    
    public String getDateInscription() { return dateInscription; }
    public void setDateInscription(String dateInscription) { this.dateInscription = dateInscription; }
    
    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }
}