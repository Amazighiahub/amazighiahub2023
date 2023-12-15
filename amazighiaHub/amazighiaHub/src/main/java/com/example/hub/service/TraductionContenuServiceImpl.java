package com.example.hub.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.hub.dto.TraductionContenuDTO;

import com.example.hub.entity.TraductionContenu;

import com.example.hub.repository.TraductionContenuRepository;
import java.util.stream.Collectors;

import java.util.List;



@Service
public class TraductionContenuServiceImpl implements TraductionContenuService {


	@Autowired
	ModelMapper modelMapper;
	
    
	  @Autowired
	  private TraductionContenuRepository traductionContenuRepository;
	 
    
    @Override
	public  TraductionContenu convertDtoToEntity(TraductionContenuDTO  traductionContenuDto) {
		// TODO Auto-generated method stub
		
		 TraductionContenu traductionContenu = modelMapper.map(traductionContenuDto, TraductionContenu.class);
		
		 return traductionContenu ;
	}

	 @Override
	public TraductionContenuDTO convertEntityToDto(TraductionContenu traductionContenu) {
		// TODO Auto-generated method stub
		TraductionContenuDTO traductionContenuDTO = modelMapper.map(traductionContenu, TraductionContenuDTO.class);
		 return traductionContenuDTO; 
	}

	@Override
	public TraductionContenuDTO findById(Long id) {
		// TODO Auto-generated method stub
		return convertEntityToDto(traductionContenuRepository.getReferenceById(id));
	}

	@Override
	public List<TraductionContenuDTO> findAll() {
		// TODO Auto-generated method stub
		return traductionContenuRepository.findAll().stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
	}

	@Override
	public TraductionContenuDTO save(TraductionContenu traductionContenu) {
		// TODO Auto-generated method stub
		return convertEntityToDto( traductionContenuRepository.save(traductionContenu));
	}

	@Override
	public TraductionContenuDTO update(TraductionContenu traductionContenu) {
		// TODO Auto-generated method stub
		return convertEntityToDto( traductionContenuRepository.save(traductionContenu));
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		traductionContenuRepository.deleteById(id);
	}

	
}

