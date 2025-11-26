package com.univ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InscriptionApplication {
    public static void main(String[] args) {
        SpringApplication.run(InscriptionApplication.class, args);
        System.out.println("✅ Inscription Service (REST) démarré sur le port 8084");
        System.out.println("📍 Endpoints disponibles:");
        System.out.println("   GET  http://localhost:8084/inscriptions");
        System.out.println("   POST http://localhost:8084/inscriptions");
        System.out.println("   GET  http://localhost:8084/inscriptions/etudiant/{id}");
    }
}