package com.univ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentApplication.class, args);
        System.out.println("✅ Student Service démarré sur le port 8081");
        System.out.println("📍 WSDL disponible sur: http://localhost:8081/ws/students.wsdl");
    }
}