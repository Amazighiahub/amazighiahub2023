package com.example.hub.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hub.dto.LangueDTO;
import com.example.hub.entity.Langue;

import com.example.hub.repository.LangueRepository;


@Service
public class LangueServiceImpl implements LangueService {
	@Autowired
	ModelMapper modelMapper;

    
	  @Autowired
	  private LangueRepository langueRepository;
    
    @Override
	public  Langue convertDtoToEntity(LangueDTO  langueDto) {
		// TODO Auto-generated method stub
		
		 Langue langue = modelMapper.map(langueDto, Langue.class);
		
		 return langue ;
	}

	 @Override
	public LangueDTO convertEntityToDto(Langue langue) {
		// TODO Auto-generated method stub
		LangueDTO langueDTO = modelMapper.map(langue, LangueDTO.class);
		 return langueDTO; 
	}

	@Override
	public LangueDTO findById(Long id) {
		// TODO Auto-generated method stub
		return convertEntityToDto(langueRepository.getReferenceById(id));
	}

	@Override
	public List<LangueDTO> findAll() {
		// TODO Auto-generated method stub
		return langueRepository.findAll().stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
	}

	@Override
	public LangueDTO save(LangueDTO langue) {
		// TODO Auto-generated method stub
		return convertEntityToDto( langueRepository.save(convertDtoToEntity(langue)));
	}

	@Override
	public LangueDTO update(LangueDTO langue) {
		// TODO Auto-generated method stub
		return convertEntityToDto( langueRepository.save(convertDtoToEntity(langue)));
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		langueRepository.deleteById(id);
	}
}
