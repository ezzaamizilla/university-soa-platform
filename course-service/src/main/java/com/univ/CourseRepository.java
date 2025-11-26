package com.univ;

import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class CourseRepository {
    private Map<String, Course> courses = new HashMap<>();
    
    public CourseRepository() {
        // Données de test
        courses.put("CS101", new Course("CS101", "Algorithmique", "Fondements des algorithmes", "T001", 4, "Lundi 10h-12h"));
        courses.put("MA201", new Course("MA201", "Mathématiques Avancées", "Algèbre linéaire", "T002", 3, "Mardi 14h-16h"));
        courses.put("PH301", new Course("PH301", "Physique Quantique", "Introduction à la physique quantique", "T003", 5, "Jeudi 9h-11h"));
    }
    
    public Course findById(String code) {
        return courses.get(code);
    }
    
    public List<Course> findAll() {
        return new ArrayList<>(courses.values());
    }
    
    public void save(Course course) {
        courses.put(course.getCode(), course);
    }
    
    public void delete(String code) {
        courses.remove(code);
    }
    
    public boolean exists(String code) {
        return courses.containsKey(code);
    }
}