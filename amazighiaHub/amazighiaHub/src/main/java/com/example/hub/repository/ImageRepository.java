package com.example.hub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hub.entity.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
    // Ajoutez ici des méthodes spécifiques au repository de l'entité Image si nécessaire
}



