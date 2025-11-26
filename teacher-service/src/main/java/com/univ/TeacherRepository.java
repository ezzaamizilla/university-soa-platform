package com.univ;

import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class TeacherRepository {
    private Map<String, Teacher> teachers = new HashMap<>();
    
    public TeacherRepository() {
        // Données de test
        teachers.put("T001", new Teacher("T001", "Durand", "Pierre", "Informatique", true, "p.durand@univ.fr"));
        teachers.put("T002", new Teacher("T002", "Leroy", "Sophie", "Mathématiques", true, "s.leroy@univ.fr"));
        teachers.put("T003", new Teacher("T003", "Moreau", "Luc", "Physique", false, "l.moreau@univ.fr"));
    }
    
    public Teacher findById(String id) {
        return teachers.get(id);
    }
    
    public List<Teacher> findAll() {
        return new ArrayList<>(teachers.values());
    }
    
    public void save(Teacher teacher) {
        teachers.put(teacher.getId(), teacher);
    }
    
    public void delete(String id) {
        teachers.remove(id);
    }
    
    public boolean exists(String id) {
        return teachers.containsKey(id);
    }
    
    public List<Teacher> findByDisponible(boolean disponible) {
        List<Teacher> result = new ArrayList<>();
        for (Teacher teacher : teachers.values()) {
            if (teacher.isDisponible() == disponible) {
                result.add(teacher);
            }
        }
        return result;
    }
}