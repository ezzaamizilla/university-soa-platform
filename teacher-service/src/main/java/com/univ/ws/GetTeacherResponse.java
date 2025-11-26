package com.univ.ws;

import com.univ.Teacher;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getTeacherResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTeacherResponse", propOrder = {"teacher"})
public class GetTeacherResponse {
    @XmlElement(name = "teacher")
    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}