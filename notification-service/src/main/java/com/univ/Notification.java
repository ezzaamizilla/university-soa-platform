package com.univ;

import java.time.LocalDateTime;

public class Notification {
    private String id;
    private String destinataire;
    private String type; // EMAIL, SMS
    private String sujet;
    private String message;
    private String statut; // ENVOYÉ, ÉCHEC
    private LocalDateTime dateEnvoi;
    
    public Notification() {}
    
    public Notification(String id, String destinataire, String type, String sujet, String message) {
        this.id = id;
        this.destinataire = destinataire;
        this.type = type;
        this.sujet = sujet;
        this.message = message;
        this.statut = "ENVOYÉ";
        this.dateEnvoi = LocalDateTime.now();
    }
    
    // Getters/Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public String getDestinataire() { return destinataire; }
    public void setDestinataire(String destinataire) { this.destinataire = destinataire; }
    
    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
    
    public String getSujet() { return sujet; }
    public void setSujet(String sujet) { this.sujet = sujet; }
    
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
    
    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }
    
    public LocalDateTime getDateEnvoi() { return dateEnvoi; }
    public void setDateEnvoi(LocalDateTime dateEnvoi) { this.dateEnvoi = dateEnvoi; }
}