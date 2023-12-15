package com.example.hub.service;

import java.util.List;

import com.example.hub.dto.LangueDTO;
import com.example.hub.entity.Langue;

public interface LangueService {
	    LangueDTO findById(Long id);
	    List<LangueDTO> findAll();
	    LangueDTO save(LangueDTO langue);
	    LangueDTO update(LangueDTO entity);
	    void deleteById(Long id);
	    Langue convertDtoToEntity(LangueDTO  langueDto);
	    LangueDTO convertEntityToDto(Langue langue) ;
}
