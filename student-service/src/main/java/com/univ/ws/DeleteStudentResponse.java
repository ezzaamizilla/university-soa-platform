package com.univ.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "deleteStudentResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteStudentResponse", propOrder = {"success", "message"})
public class DeleteStudentResponse {
    @XmlElement
    private boolean success;
    
    @XmlElement
    private String message;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}