package com.example.hub.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hub.dto.TypeContenuDTO;
import com.example.hub.entity.TypeContenu;

import com.example.hub.repository.TypeContenuRepository;


@Service
public class TypeContenuServiceImpl implements TypeContenuService{
	@Autowired
	ModelMapper modelMapper;

    
	  @Autowired
	  private TypeContenuRepository typeContenuRepository;
    
    @Override
	public  TypeContenu convertDtoToEntity(TypeContenuDTO  TypeContenuDto) {
		// TODO Auto-generated method stub
		
		 TypeContenu  typeContenu = new TypeContenu();
		 typeContenu = modelMapper.map(TypeContenuDto, TypeContenu.class);
		
		 return typeContenu ;
	}

	 @Override
	public TypeContenuDTO convertEntityToDto(TypeContenu TypeContenu) {
		// TODO Auto-generated method stub
		 modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		TypeContenuDTO typeContenuDTO = modelMapper.map(TypeContenu, TypeContenuDTO.class);
		 return typeContenuDTO; 
	}

	@Override
	public TypeContenuDTO findById(Long id) {
		// TODO Auto-generated method stub
		return convertEntityToDto(typeContenuRepository.getReferenceById(id));
	}

	@Override
	public List<TypeContenuDTO> findAll() {
		// TODO Auto-generated method stub
		return typeContenuRepository.findAll().stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
	}

	@Override
	public TypeContenuDTO save(TypeContenuDTO TypeContenu) {
		// TODO Auto-generated method stub
		
		return convertEntityToDto( typeContenuRepository.save(convertDtoToEntity(TypeContenu)));
	}

	@Override
	public TypeContenuDTO update(TypeContenuDTO TypeContenu) {
		// TODO Auto-generated method stub
		
		return convertEntityToDto( typeContenuRepository.save(convertDtoToEntity(TypeContenu)));
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		typeContenuRepository.deleteById(id);
	}
}
