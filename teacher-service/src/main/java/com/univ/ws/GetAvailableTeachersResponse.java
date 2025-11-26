package com.univ.ws;

import com.univ.Teacher;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getAvailableTeachersResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetAvailableTeachersResponse", propOrder = {"teachers"})
public class GetAvailableTeachersResponse {
    @XmlElement(name = "teachers")
    private List<Teacher> teachers = new ArrayList<>();

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}