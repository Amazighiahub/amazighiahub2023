package com.example.hub.service;

import java.util.List;

import com.example.hub.dto.MotDifficileContenuDTO;
import com.example.hub.entity.MotDifficileContenu;

public interface MotDifficileContenuService {
	  MotDifficileContenuDTO findById(Long id);
	    List<MotDifficileContenuDTO> findAll();
	    MotDifficileContenuDTO save(MotDifficileContenu motDifficileContenu);
	    MotDifficileContenuDTO update(MotDifficileContenu entity);
	    void deleteById(Long id);
	    MotDifficileContenu convertDtoToEntity(MotDifficileContenuDTO  motDifficileContenuDto);
	    MotDifficileContenuDTO convertEntityToDto(MotDifficileContenu 		motDifficileContenu	) ;

}
