package com.univ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NotificationApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
        System.out.println("✅ Notification Service (REST) démarré sur le port 8085");
        System.out.println("📍 Endpoints disponibles:");
        System.out.println("   GET  http://localhost:8085/notifications");
        System.out.println("   POST http://localhost:8085/notifications");
        System.out.println("   POST http://localhost:8085/notifications/inscription");
        System.out.println("   GET  http://localhost:8085/notifications/destinataire/{email}");
    }
}