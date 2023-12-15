package com.example.hub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hub.entity.MotCleContenu;

public interface MotCleContenuRepository extends JpaRepository<MotCleContenu, Long> {
    // Ajoutez ici des méthodes spécifiques au repository de l'entité MotCleContenu si nécessaire
}


