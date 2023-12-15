package com.example.hub.service;

import java.util.List;

import com.example.hub.dto.MotDifficileDTO;
import com.example.hub.entity.MotDifficile;

public interface MotDifficileService {
	MotDifficileDTO findById(Long id);
    List<MotDifficileDTO> findAll();
    MotDifficileDTO save(MotDifficile MotDifficile);
    MotDifficileDTO update(MotDifficile entity);
    void deleteById(Long id);
    MotDifficile convertDtoToEntity(MotDifficileDTO  MotDifficileDto);
    MotDifficileDTO convertEntityToDto(MotDifficile MotDifficile) ;
}
