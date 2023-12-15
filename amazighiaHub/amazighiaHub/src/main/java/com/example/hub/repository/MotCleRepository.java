package com.example.hub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hub.entity.MotCle;


public interface MotCleRepository extends JpaRepository<MotCle, Long> {
    // Ajoutez ici des méthodes spécifiques au repository de l'entité MotCle si nécessaire
}
