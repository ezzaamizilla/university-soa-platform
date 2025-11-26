package com.univ.ws;

import com.univ.Student;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getStudentsByFiliereResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetStudentsByFiliereResponse", propOrder = {"students"})
public class GetStudentsByFiliereResponse {
    @XmlElement(name = "students")
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}