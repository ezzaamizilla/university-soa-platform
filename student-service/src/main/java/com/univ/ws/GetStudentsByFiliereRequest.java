package com.univ.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getStudentsByFiliereRequest")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStudentsByFiliereRequest", propOrder = {"filiere"})
public class GetStudentsByFiliereRequest {
    @XmlElement(required = true)
    private String filiere;

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }
}