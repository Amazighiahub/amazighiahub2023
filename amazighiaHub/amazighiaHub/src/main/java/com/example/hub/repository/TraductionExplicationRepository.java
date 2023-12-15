package com.example.hub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hub.entity.TraductionExplication;

public interface TraductionExplicationRepository extends JpaRepository<TraductionExplication, Long> {
    // Ajoutez ici des méthodes spécifiques au repository de l'entité TraductionExplication si nécessaire
}

