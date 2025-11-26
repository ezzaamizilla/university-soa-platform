package com.univ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationController {
    
    @Autowired
    private NotificationRepository notificationRepository;
    
    // GET /notifications - Liste toutes les notifications
    @GetMapping
    public List<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }
    
    // POST /notifications - Envoyer une nouvelle notification
    @PostMapping
    public String envoyerNotification(@RequestBody Notification notification) {
        notificationRepository.save(notification);
        return "✅ Notification envoyée à " + notification.getDestinataire();
    }
    
    // POST /notifications/inscription - Notification spécifique pour inscription
    @PostMapping("/inscription")
    public String notifierInscription(@RequestBody InscriptionRequest request) {
        Notification notification = new Notification(
            null,
            request.getEmail(),
            "EMAIL", 
            "Confirmation d'inscription - " + request.getCoursTitre(),
            "Bonjour " + request.getEtudiantNom() + ",\n\n" +
            "Votre inscription au cours '" + request.getCoursTitre() + "' a été confirmée.\n" +
            "Date: " + request.getDateInscription() + "\n\n" +
            "Cordialement,\nUniversité SOA"
        );
        
        notificationRepository.save(notification);
        return "✅ Notification d'inscription envoyée à " + request.getEmail();
    }
    
    // GET /notifications/destinataire/{email} - Notifications d'un destinataire
    @GetMapping("/destinataire/{destinataire}")
    public List<Notification> getNotificationsByDestinataire(@PathVariable String destinataire) {
        return notificationRepository.findByDestinataire(destinataire);
    }
    
    // Classe pour la requête d'inscription
    public static class InscriptionRequest {
        private String email;
        private String etudiantNom;
        private String coursTitre;
        private String dateInscription;
        
        // Getters/Setters
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
        
        public String getEtudiantNom() { return etudiantNom; }
        public void setEtudiantNom(String etudiantNom) { this.etudiantNom = etudiantNom; }
        
        public String getCoursTitre() { return coursTitre; }
        public void setCoursTitre(String coursTitre) { this.coursTitre = coursTitre; }
        
        public String getDateInscription() { return dateInscription; }
        public void setDateInscription(String dateInscription) { this.dateInscription = dateInscription; }
    }
}