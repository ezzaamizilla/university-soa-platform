package com.univ;

import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class NotificationRepository {
    private Map<String, Notification> notifications = new HashMap<>();
    private int idCounter = 1;
    
    public NotificationRepository() {
        // Données de test
        save(new Notification("NOTIF001", "etudiant@univ.fr", "EMAIL", "Confirmation d'inscription", "Votre inscription au cours CS101 a été confirmée."));
        save(new Notification("NOTIF002", "0123456789", "SMS", "Rappel cours", "Rappel: Cours de Mathématiques demain à 14h"));
    }
    
    public List<Notification> findAll() {
        return new ArrayList<>(notifications.values());
    }
    
    public Notification findById(String id) {
        return notifications.get(id);
    }
    
    public Notification save(Notification notification) {
        if (notification.getId() == null) {
            notification.setId("NOTIF" + (++idCounter));
        }
        notifications.put(notification.getId(), notification);
        return notification;
    }
    
    public List<Notification> findByDestinataire(String destinataire) {
        List<Notification> result = new ArrayList<>();
        for (Notification notif : notifications.values()) {
            if (destinataire.equals(notif.getDestinataire())) {
                result.add(notif);
            }
        }
        return result;
    }
}