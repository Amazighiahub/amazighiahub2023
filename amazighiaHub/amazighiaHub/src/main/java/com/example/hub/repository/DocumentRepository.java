package com.example.hub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hub.entity.Document;

public interface DocumentRepository extends JpaRepository<Document, Long> {
    // Ajoutez ici des méthodes spécifiques au repository de l'entité Document si nécessaire
}

