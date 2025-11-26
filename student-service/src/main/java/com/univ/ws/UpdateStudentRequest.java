package com.univ.ws;

import com.univ.Student;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "updateStudentRequest")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateStudentRequest", propOrder = {"student"})
public class UpdateStudentRequest {
    @XmlElement(name = "student", required = true)
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}