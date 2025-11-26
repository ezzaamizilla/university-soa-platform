package com.univ.ws;

import com.univ.Course;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getCourseResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetCourseResponse", propOrder = {"course"})
public class GetCourseResponse {
    @XmlElement(name = "course")
    private Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}