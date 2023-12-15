package com.example.hub.service;

import java.util.List;


import com.example.hub.dto.TraductionContenuDTO;
import com.example.hub.entity.TraductionContenu;

public interface TraductionContenuService {

	TraductionContenuDTO findById(Long id);
    List<TraductionContenuDTO> findAll();
    TraductionContenuDTO save(TraductionContenu TraductionContenu);
    TraductionContenuDTO update(TraductionContenu entity);
    void deleteById(Long id);
    TraductionContenu convertDtoToEntity(TraductionContenuDTO  TraductionContenuDto);
    TraductionContenuDTO convertEntityToDto(TraductionContenu TraductionContenu) ;
   
}
