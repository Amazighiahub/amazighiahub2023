package com.example.hub.service;

import java.util.List;

import com.example.hub.dto.ReferenceDTO;
import com.example.hub.entity.Reference;

public interface ReferenceService {

	ReferenceDTO findById(Long id);
    List<ReferenceDTO> findAll();
    ReferenceDTO save(Reference Reference);
    ReferenceDTO update(Reference entity);
    void deleteById(Long id);
    Reference convertDtoToEntity(ReferenceDTO  ReferenceDto);
    ReferenceDTO convertEntityToDto(Reference Reference) ;
}
