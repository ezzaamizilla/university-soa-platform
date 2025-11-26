package com.univ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.univ.ws.*;
import java.util.List;

@Endpoint
public class TeacherEndpoint {
    private static final String NAMESPACE_URI = "http://univ.com/teacher";
    
    @Autowired
    private TeacherRepository teacherRepository;
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getTeacherRequest")
    @ResponsePayload
    public GetTeacherResponse getTeacher(@RequestPayload GetTeacherRequest request) {
        GetTeacherResponse response = new GetTeacherResponse();
        response.setTeacher(teacherRepository.findById(request.getId()));
        return response;
    }
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAllTeachersRequest")
    @ResponsePayload
    public GetAllTeachersResponse getAllTeachers(@RequestPayload GetAllTeachersRequest request) {
        GetAllTeachersResponse response = new GetAllTeachersResponse();
        response.setTeachers(teacherRepository.findAll());
        return response;
    }
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getAvailableTeachersRequest")
    @ResponsePayload
    public GetAvailableTeachersResponse getAvailableTeachers(@RequestPayload GetAvailableTeachersRequest request) {
        GetAvailableTeachersResponse response = new GetAvailableTeachersResponse();
        response.setTeachers(teacherRepository.findByDisponible(true));
        return response;
    }
}