package com.univ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TeacherApplication {
    public static void main(String[] args) {
        SpringApplication.run(TeacherApplication.class, args);
        System.out.println("✅ Teacher Service (SOAP) démarré sur le port 8082");
        System.out.println("📍 WSDL disponible sur: http://localhost:8082/ws/teachers.wsdl");
    }
}