package com.example.hub.service;

import java.util.List;

import com.example.hub.dto.TypeContenuDTO;
import com.example.hub.entity.TypeContenu;

public interface TypeContenuService {
	TypeContenu convertDtoToEntity(TypeContenuDTO typeContenuDto);

	TypeContenuDTO convertEntityToDto(TypeContenu typeContenu);

	TypeContenuDTO findById(Long id);

	List<TypeContenuDTO> findAll();

	TypeContenuDTO save(TypeContenuDTO typeContenu);

	TypeContenuDTO update(TypeContenuDTO typeContenu);

	void deleteById(Long id);

}
