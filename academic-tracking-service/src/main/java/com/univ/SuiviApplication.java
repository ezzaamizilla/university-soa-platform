package com.univ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SuiviApplication {
    public static void main(String[] args) {
        SpringApplication.run(SuiviApplication.class, args);
        System.out.println("✅ Academic Tracking Service (REST) démarré sur le port 8086");
        System.out.println("📍 Endpoints disponibles:");
        System.out.println("   GET  http://localhost:8086/suivi");
        System.out.println("   GET  http://localhost:8086/suivi/etudiant/{id}");
        System.out.println("   GET  http://localhost:8086/suivi/etudiant/{id}/valides");
        System.out.println("   POST http://localhost:8086/suivi");
        System.out.println("   PUT  http://localhost:8086/suivi/{id}/note");
        System.out.println("   GET  http://localhost:8086/suivi/{id}/attestation");
    }
}