package com.example.hub.repository;





import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hub.entity.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    // Ajoutez ici des méthodes spécifiques au repository de l'entité Utilisateur si nécessaire
	Utilisateur findByAdresseEmail(String email);

}
