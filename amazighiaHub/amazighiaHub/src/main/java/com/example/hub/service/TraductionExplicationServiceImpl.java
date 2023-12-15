package com.example.hub.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hub.dto.TraductionExplicationDTO;
import com.example.hub.entity.TraductionExplication;

import com.example.hub.repository.TraductionExplicationRepository;


@Service
public class TraductionExplicationServiceImpl implements TraductionExplicationService {

	@Autowired
	ModelMapper modelMapper;

    
	  @Autowired
	  private TraductionExplicationRepository traductionExplicationRepository;
    
    @Override
	public  TraductionExplication convertDtoToEntity(TraductionExplicationDTO  traductionExplicationDto) {
		// TODO Auto-generated method stub
		
		 TraductionExplication traductionExplication = modelMapper.map(traductionExplicationDto, TraductionExplication.class);
		
		 return traductionExplication ;
	}

	 @Override
	public TraductionExplicationDTO convertEntityToDto(TraductionExplication traductionExplication) {
		// TODO Auto-generated method stub
		TraductionExplicationDTO traductionExplicationDTO = modelMapper.map(traductionExplication, TraductionExplicationDTO.class);
		 return traductionExplicationDTO; 
	}

	@Override
	public TraductionExplicationDTO findById(Long id) {
		// TODO Auto-generated method stub
		return convertEntityToDto(traductionExplicationRepository.getReferenceById(id));
	}

	@Override
	public List<TraductionExplicationDTO> findAll() {
		// TODO Auto-generated method stub
		return traductionExplicationRepository.findAll().stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
	}

	@Override
	public TraductionExplicationDTO save(TraductionExplication traductionExplication) {
		// TODO Auto-generated method stub
		return convertEntityToDto( traductionExplicationRepository.save(traductionExplication));
	}

	@Override
	public TraductionExplicationDTO update(TraductionExplication traductionExplication) {
		// TODO Auto-generated method stub
		return convertEntityToDto( traductionExplicationRepository.save(traductionExplication));
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		traductionExplicationRepository.deleteById(id);
	}
}
