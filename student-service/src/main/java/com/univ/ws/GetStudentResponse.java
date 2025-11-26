package com.univ.ws;

import com.univ.Student;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(name = "GetStudentResponse")
public class GetStudentResponse {
    private Student student;
    
    public Student getStudent() {
        return student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }
}