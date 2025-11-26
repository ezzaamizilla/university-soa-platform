package com.univ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import java.util.List;

@Endpoint
public class StudentEndpoint {
    private static final String NAMESPACE_URI = "http://univ.com/student";
    
    @Autowired
    private StudentRepository studentRepository;
    
    // Version simplifiée sans classes de requête complexes
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getStudentRequest")
    @ResponsePayload
    public String getStudent(@RequestPayload String request) {
        // Logique simplifiée pour tester
        Student student = studentRepository.findById("2025001"); // Test avec un ID fixe
        return "<response><student>" + student.getNom() + "</student></response>";
    }
}