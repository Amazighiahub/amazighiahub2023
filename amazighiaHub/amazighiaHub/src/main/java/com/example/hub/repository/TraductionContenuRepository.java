package com.example.hub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hub.entity.Contenu;
import com.example.hub.entity.TraductionContenu;

public interface TraductionContenuRepository extends JpaRepository<TraductionContenu, Long> {
    // Ajoutez ici des méthodes spécifiques au repository de l'entité Traduction si nécessaire
	List<TraductionContenu> findByContenu(Contenu contenu);
}

