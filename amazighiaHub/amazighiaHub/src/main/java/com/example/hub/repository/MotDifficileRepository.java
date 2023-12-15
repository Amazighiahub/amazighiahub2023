package com.example.hub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hub.entity.MotDifficile;

public interface MotDifficileRepository extends JpaRepository<MotDifficile, Long> {
    // Ajoutez ici des méthodes spécifiques au repository de l'entité MotDifficile si nécessaire
}

