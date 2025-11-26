package com.univ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApplication {
    public static void main(String[] args) {
        SpringApplication.run(CourseApplication.class, args);
        System.out.println("✅ Course Service démarré sur le port 8083");
        System.out.println("📍 WSDL disponible sur: http://localhost:8083/ws/courses.wsdl");
    }
}
