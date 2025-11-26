package com.univ.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getTeacherRequest")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTeacherRequest", propOrder = {"id"})
public class GetTeacherRequest {
    @XmlElement(required = true)
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}