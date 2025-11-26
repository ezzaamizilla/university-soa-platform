package com.univ;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
    private String matricule;
    private String nom;
    private String prenom;
    private String filiere;
    private int annee;
    
    public Student() {}
    
    public Student(String matricule, String nom, String prenom, String filiere, int annee) {
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.filiere = filiere;
        this.annee = annee;
    }
    
    // Getters and Setters
    public String getMatricule() { return matricule; }
    public void setMatricule(String matricule) { this.matricule = matricule; }
    
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }
    
    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }
    
    public String getFiliere() { return filiere; }
    public void setFiliere(String filiere) { this.filiere = filiere; }
    
    public int getAnnee() { return annee; }
    public void setAnnee(int annee) { this.annee = annee; }
}