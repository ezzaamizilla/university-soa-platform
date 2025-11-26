package com.univ.ws;

import com.univ.Student;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement
@XmlType(name = "GetAllStudentsResponse")
public class GetAllStudentsResponse {
    private List<Student> students = new ArrayList<>();
    
    public List<Student> getStudents() {
        return students;
    }
    
    public void setStudents(List<Student> students) {
        this.students = students;
    }
}