-- Nettoyer et insérer des données de test
DELETE FROM students;

INSERT INTO students (matricule, nom, prenom, filiere, annee) VALUES
('2025001', 'Dupont', 'Jean', 'Informatique', 2),
('2025002', 'Martin', 'Marie', 'Mathématiques', 1),
('2025003', 'Bernard', 'Pierre', 'Physique', 3),
('2025004', 'Dubois', 'Sophie', 'Informatique', 2),
('2025005', 'Laurent', 'Thomas', 'Mathématiques', 3);