package com.example.hub.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.hub.entity.Commentaire;

public interface CommentaireRepository extends JpaRepository<Commentaire, Long> {
    // Ajoutez ici des méthodes spécifiques au repository de l'entité Commentaire si nécessaire
}

