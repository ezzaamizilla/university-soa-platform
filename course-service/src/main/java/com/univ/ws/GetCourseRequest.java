package com.univ.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getCourseRequest")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCourseRequest", propOrder = {"code"})
public class GetCourseRequest {
    @XmlElement(required = true)
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}