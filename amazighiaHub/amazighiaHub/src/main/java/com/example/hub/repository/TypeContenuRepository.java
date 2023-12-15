package com.example.hub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hub.entity.TypeContenu;

public interface TypeContenuRepository extends JpaRepository<TypeContenu, Long> {
    // Ajoutez ici des méthodes spécifiques au repository de l'entité TypeContenu si nécessaire
}
