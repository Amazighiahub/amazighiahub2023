package com.example.hub.service;

import java.util.List;

import com.example.hub.dto.ValidationContenuDTO;
import com.example.hub.entity.ValidationContenu;

public interface ValidationContenuService {
	ValidationContenu convertDtoToEntity(ValidationContenuDTO ValidationContenuDto);

	ValidationContenuDTO convertEntityToDto(ValidationContenu ValidationContenu);

	ValidationContenuDTO findById(Long id);

	List<ValidationContenuDTO> findAll();

	ValidationContenuDTO save(ValidationContenu ValidationContenu);

	ValidationContenuDTO update(ValidationContenu ValidationContenu);

	void deleteById(Long id);
}
