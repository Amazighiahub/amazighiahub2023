package com.example.hub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hub.entity.ValidationContenu;

public interface ValidationContenuRepository extends JpaRepository<ValidationContenu, Long> {
    // Ajoutez ici des méthodes spécifiques au repository de l'entité ValidationContenu si nécessaire
}