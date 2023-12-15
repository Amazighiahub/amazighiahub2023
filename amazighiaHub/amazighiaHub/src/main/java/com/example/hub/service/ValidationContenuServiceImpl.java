package com.example.hub.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hub.dto.ValidationContenuDTO;
import com.example.hub.entity.ValidationContenu;
import com.example.hub.repository.ValidationContenuRepository;


@Service
public class ValidationContenuServiceImpl implements ValidationContenuService {

	@Autowired
	ModelMapper modelMapper;

    
	  @Autowired
	  private ValidationContenuRepository ValidationContenuRepository;
    
    @Override
	public  ValidationContenu convertDtoToEntity(ValidationContenuDTO  ValidationContenuDto) {
		// TODO Auto-generated method stub
		
		 ValidationContenu ValidationContenu = modelMapper.map(ValidationContenuDto, ValidationContenu.class);
		
		 return ValidationContenu ;
	}

	 @Override
	public ValidationContenuDTO convertEntityToDto(ValidationContenu ValidationContenu) {
		// TODO Auto-generated method stub
		ValidationContenuDTO ValidationContenuDTO = modelMapper.map(ValidationContenu, ValidationContenuDTO.class);
		 return ValidationContenuDTO; 
	}

	@Override
	public ValidationContenuDTO findById(Long id) {
		// TODO Auto-generated method stub
		return convertEntityToDto(ValidationContenuRepository.getReferenceById(id));
	}

	@Override
	public List<ValidationContenuDTO> findAll() {
		// TODO Auto-generated method stub
		return ValidationContenuRepository.findAll().stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
	}

	@Override
	public ValidationContenuDTO save(ValidationContenu ValidationContenu) {
		// TODO Auto-generated method stub
		return convertEntityToDto( ValidationContenuRepository.save(ValidationContenu));
	}

	@Override
	public ValidationContenuDTO update(ValidationContenu ValidationContenu) {
		// TODO Auto-generated method stub
		return convertEntityToDto( ValidationContenuRepository.save(ValidationContenu));
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		ValidationContenuRepository.deleteById(id);
	}
}
