package com.example.hub.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hub.dto.ContenuAuteurDTO;
import com.example.hub.entity.ContenuAuteur;

import com.example.hub.repository.ContenuAuteurRepository;


@Service
public class ContenuAuteurServiceImpl implements ContenuAuteurService {

	@Autowired
	ModelMapper modelMapper;

    
	  @Autowired
	  private ContenuAuteurRepository contenuAuteurRepository;
    

	  
	  
	

    @Override
	public  ContenuAuteur convertDtoToEntity(ContenuAuteurDTO  ContenuAuteurDto) {
		// TODO Auto-generated method stub
		
		 ContenuAuteur ContenuAuteur = modelMapper.map(ContenuAuteurDto, ContenuAuteur.class);
		
		 return ContenuAuteur ;
	}

	 @Override
	public ContenuAuteurDTO convertEntityToDto(ContenuAuteur ContenuAuteur) {
		// TODO Auto-generated method stub
		ContenuAuteurDTO ContenuAuteurDTO = modelMapper.map(ContenuAuteur, ContenuAuteurDTO.class);
		 return ContenuAuteurDTO; 
	}

	@Override
	public ContenuAuteurDTO findById(Long id) {
		// TODO Auto-generated method stub
		return convertEntityToDto(contenuAuteurRepository.getReferenceById(id));
	}

	@Override
	public List<ContenuAuteurDTO> findAll() {
		// TODO Auto-generated method stub
		return contenuAuteurRepository.findAll().stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
	}

	@Override
	public ContenuAuteurDTO save(ContenuAuteurDTO contenuAuteur) {
		// TODO Auto-generated method stub
		return convertEntityToDto( contenuAuteurRepository.save(convertDtoToEntity(contenuAuteur)));
	}

	@Override
	public ContenuAuteurDTO update(ContenuAuteurDTO contenuAuteur) {
		// TODO Auto-generated method stub
		return convertEntityToDto( contenuAuteurRepository.save(convertDtoToEntity(contenuAuteur)));
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		contenuAuteurRepository.deleteById(id);
	}
}
