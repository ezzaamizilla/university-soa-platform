package com.univ;

import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class StudentRepository {
    private Map<String, Student> students = new HashMap<>();
    
    public StudentRepository() {
        // Données de test
        students.put("2025001", new Student("2025001", "Dupont", "Jean", "Informatique", 2));
        students.put("2025002", new Student("2025002", "Martin", "Marie", "Mathématiques", 1));
        students.put("2025003", new Student("2025003", "Bernard", "Pierre", "Physique", 3));
    }
    
    public Student findById(String matricule) {
        return students.get(matricule);
    }
    
    public List<Student> findAll() {
        return new ArrayList<>(students.values());
    }
    
    public void save(Student student) {
        students.put(student.getMatricule(), student);
    }
    
    public void delete(String matricule) {
        students.remove(matricule);
    }
    
    public boolean exists(String matricule) {
        return students.containsKey(matricule);
    }
}