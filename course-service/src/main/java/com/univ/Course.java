package com.univ;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Course {
    private String code;
    private String titre;
    private String description;
    private String enseignantId;
    private int credits;
    private String horaires;
    
    public Course() {}
    
    public Course(String code, String titre, String description, String enseignantId, int credits, String horaires) {
        this.code = code;
        this.titre = titre;
        this.description = description;
        this.enseignantId = enseignantId;
        this.credits = credits;
        this.horaires = horaires;
    }
    
    // Getters and Setters
    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    
    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }
    
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    
    public String getEnseignantId() { return enseignantId; }
    public void setEnseignantId(String enseignantId) { this.enseignantId = enseignantId; }
    
    public int getCredits() { return credits; }
    public void setCredits(int credits) { this.credits = credits; }
    
    public String getHoraires() { return horaires; }
    public void setHoraires(String horaires) { this.horaires = horaires; }
}