package com.example.hub.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hub.dto.MotDifficileDTO;

import com.example.hub.entity.MotDifficile;

import com.example.hub.repository.MotDifficileRepository;


@Service
public class MotDifficileServiceImpl implements MotDifficileService {

	@Autowired
	ModelMapper modelMapper;

    
	  @Autowired
	  private MotDifficileRepository motDifficileRepository;
    
    @Override
	public  MotDifficile convertDtoToEntity(MotDifficileDTO  motDifficileDto) {
		// TODO Auto-generated method stub
		
		 MotDifficile MotDifficile = modelMapper.map(motDifficileDto, MotDifficile.class);
		
		 return MotDifficile ;
	}

	 @Override
	public MotDifficileDTO convertEntityToDto(MotDifficile motDifficile) {
		// TODO Auto-generated method stub
		MotDifficileDTO motDifficileDTO = modelMapper.map(motDifficile, MotDifficileDTO.class);
		 return motDifficileDTO; 
	}

	@Override
	public MotDifficileDTO findById(Long id) {
		// TODO Auto-generated method stub
		return convertEntityToDto(motDifficileRepository.getReferenceById(id));
	}

	@Override
	public List<MotDifficileDTO> findAll() {
		// TODO Auto-generated method stub
		return motDifficileRepository.findAll().stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
	}

	@Override
	public MotDifficileDTO save(MotDifficile MotDifficile) {
		// TODO Auto-generated method stub
		return convertEntityToDto( motDifficileRepository.save(MotDifficile));
	}

	@Override
	public MotDifficileDTO update(MotDifficile MotDifficile) {
		// TODO Auto-generated method stub
		return convertEntityToDto( motDifficileRepository.save(MotDifficile));
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		motDifficileRepository.deleteById(id);
	}
}

