package com.example.hub.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hub.entity.ContenuAuteur;

public interface ContenuAuteurRepository extends JpaRepository<ContenuAuteur, Long> {
    // Ajoutez ici des méthodes spécifiques au repository de l'entité ContenuAuteur si nécessaire
}
