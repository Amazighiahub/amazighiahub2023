package com.example.hub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hub.entity.Langue;

public interface LangueRepository extends JpaRepository<Langue, Long> {
    // Ajoutez ici des méthodes spécifiques au repository de l'entité Langue si nécessaire
}

