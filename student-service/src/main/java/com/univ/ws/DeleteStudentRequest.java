package com.univ.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "deleteStudentRequest")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteStudentRequest", propOrder = {"matricule"})
public class DeleteStudentRequest {
    @XmlElement(required = true)
    private String matricule;

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
}