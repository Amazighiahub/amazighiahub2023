package com.example.hub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hub.entity.Reference;

public interface ReferenceRepository extends JpaRepository<Reference, Long> {
    // Ajoutez ici des méthodes spécifiques au repository de l'entité Reference si nécessaire
}

