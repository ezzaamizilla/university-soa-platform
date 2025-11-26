package com.univ;

public class SuiviAcademique {
    private String id;
    private String etudiantId;
    private String coursId;
    private String coursTitre;
    private double note;
    private String statut; // "EN_COURS", "VALIDÉ", "ECHEC"
    private String dateDebut;
    private String dateFin;
    private String attestationUrl;
    
    public SuiviAcademique() {}
    
    public SuiviAcademique(String id, String etudiantId, String coursId, String coursTitre, String dateDebut) {
        this.id = id;
        this.etudiantId = etudiantId;
        this.coursId = coursId;
        this.coursTitre = coursTitre;
        this.note = 0.0;
        this.statut = "EN_COURS";
        this.dateDebut = dateDebut;
        this.dateFin = null;
        this.attestationUrl = null;
    }
    
    // Getters/Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getEtudiantId() { return etudiantId; }
    public void setEtudiantId(String etudiantId) { this.etudiantId = etudiantId; }
    
    public String getCoursId() { return coursId; }
    public void setCoursId(String coursId) { this.coursId = coursId; }
    
    public String getCoursTitre() { return coursTitre; }
    public void setCoursTitre(String coursTitre) { this.coursTitre = coursTitre; }
    
    public double getNote() { return note; }
    public void setNote(double note) { this.note = note; }
    
    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }
    
    public String getDateDebut() { return dateDebut; }
    public void setDateDebut(String dateDebut) { this.dateDebut = dateDebut; }
    
    public String getDateFin() { return dateFin; }
    public void setDateFin(String dateFin) { this.dateFin = dateFin; }
    
    public String getAttestationUrl() { return attestationUrl; }
    public void setAttestationUrl(String attestationUrl) { this.attestationUrl = attestationUrl; }
}