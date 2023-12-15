package com.example.hub.service;

import java.util.List;

import com.example.hub.dto.ContenuDTO;
import com.example.hub.dto.UtilisateurDTO;
import com.example.hub.entity.Contenu;

public interface ContenuService {
	  ContenuDTO findById(Long id);
	    List<ContenuDTO> findAll();
	  
	    ContenuDTO save(ContenuDTO Contenu);
	    ContenuDTO update(ContenuDTO entity);
	    void deleteById(Long id);
	    Contenu convertDtoToEntity(ContenuDTO  ContenuDto);
	    ContenuDTO convertEntityToDto(Contenu Contenu) ;
	    List<ContenuDTO> getAllContenusWithTranslations();
	    List<ContenuDTO> findByUser(Long id);
}
