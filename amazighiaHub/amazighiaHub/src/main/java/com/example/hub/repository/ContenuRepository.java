package com.example.hub.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hub.entity.Contenu;
import com.example.hub.entity.Utilisateur;

public interface ContenuRepository extends JpaRepository<Contenu, Long> {
    // Ajoutez ici des méthodes spécifiques au repository de l'entité Contenu si nécessaire
	List<Contenu> findByUtilisateur(Utilisateur utilisateur);
}
