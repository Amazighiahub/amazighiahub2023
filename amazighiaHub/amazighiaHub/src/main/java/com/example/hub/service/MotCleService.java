package com.example.hub.service;

import java.util.List;

import com.example.hub.dto.MotCleDTO;
import com.example.hub.entity.MotCle;

public interface MotCleService {
	MotCleDTO findById(Long id);
    List<MotCleDTO> findAll();
    MotCleDTO save(MotCleDTO MotCle);
    MotCleDTO update(MotCleDTO entity);
    void deleteById(Long id);
    MotCle convertDtoToEntity(MotCleDTO  MotCleDto);
    MotCleDTO convertEntityToDto(MotCle MotCle) ;
}
