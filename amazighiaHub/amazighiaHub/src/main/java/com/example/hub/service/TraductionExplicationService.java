package com.example.hub.service;

import java.util.List;

import com.example.hub.dto.TraductionExplicationDTO;
import com.example.hub.entity.TraductionExplication;

public interface TraductionExplicationService {

	TraductionExplication convertDtoToEntity(TraductionExplicationDTO TraductionExplicationDto);

	TraductionExplicationDTO convertEntityToDto(TraductionExplication TraductionExplication);

	TraductionExplicationDTO findById(Long id);

	List<TraductionExplicationDTO> findAll();

	TraductionExplicationDTO save(TraductionExplication TraductionExplication);

	TraductionExplicationDTO update(TraductionExplication TraductionExplication);

	void deleteById(Long id);

}
