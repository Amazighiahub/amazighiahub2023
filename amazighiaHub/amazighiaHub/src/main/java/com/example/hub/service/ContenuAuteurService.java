package com.example.hub.service;

import java.util.List;

import com.example.hub.dto.ContenuAuteurDTO;
import com.example.hub.entity.ContenuAuteur;

public interface ContenuAuteurService {
	ContenuAuteurDTO findById(Long id);
    List<ContenuAuteurDTO> findAll();
    ContenuAuteurDTO save(ContenuAuteurDTO contenuAuteur);
    ContenuAuteurDTO update(ContenuAuteurDTO entity);
    void deleteById(Long id);
    ContenuAuteur convertDtoToEntity(ContenuAuteurDTO  contenuAuteurDto);
    ContenuAuteurDTO convertEntityToDto(ContenuAuteur contenuAuteur) ;
}
