package com.univ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import java.util.List;

@Endpoint
public class CourseEndpoint {
    private static final String NAMESPACE_URI = "http://univ.com/course";
    
    @Autowired
    private CourseRepository courseRepository;
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCourseRequest")
    @ResponsePayload
    public String getCourse(@RequestPayload String request) {
        // Logique simplifiée pour tester
        Course course = courseRepository.findById("CS101"); // Test avec un code fixe
        if (course != null) {
            return "<response><course>" + course.getTitre() + "</course></response>";
        }
        return "<response><error>Cours non trouvé</error></response>";
    }
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllCoursesRequest")
    @ResponsePayload
    public String getAllCourses(@RequestPayload String request) {
        List<Course> courses = courseRepository.findAll();
        StringBuilder response = new StringBuilder("<response><courses>");
        for (Course course : courses) {
            response.append("<course>").append(course.getTitre()).append("</course>");
        }
        response.append("</courses></response>");
        return response.toString();
    }
}