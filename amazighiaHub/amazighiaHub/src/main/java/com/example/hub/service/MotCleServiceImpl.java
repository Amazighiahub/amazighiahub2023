package com.example.hub.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hub.dto.MotCleDTO;
import com.example.hub.entity.MotCle;

import com.example.hub.repository.MotCleRepository;



@Service
public class MotCleServiceImpl implements MotCleService {

	@Autowired
	ModelMapper modelMapper;

    
	  @Autowired
	  private MotCleRepository motCleRepository;
    
    @Override
	public  MotCle convertDtoToEntity(MotCleDTO  motCleDto) {
		// TODO Auto-generated method stub
		
		 MotCle motCle = modelMapper.map(motCleDto, MotCle.class);
		
		 return motCle ;
	}

	 @Override
	public MotCleDTO convertEntityToDto(MotCle motCle) {
		// TODO Auto-generated method stub
		MotCleDTO motCleDTO = modelMapper.map(motCle, MotCleDTO.class);
		 return motCleDTO; 
	}

	@Override
	public MotCleDTO findById(Long id) {
		// TODO Auto-generated method stub
		return convertEntityToDto(motCleRepository.getReferenceById(id));
	}

	@Override
	public List<MotCleDTO> findAll() {
		// TODO Auto-generated method stub
		return motCleRepository.findAll().stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
	}

	@Override
	public MotCleDTO save(MotCleDTO MotCle) {
		// TODO Auto-generated method stub
		return convertEntityToDto( motCleRepository.save(convertDtoToEntity(MotCle)));
	}

	@Override
	public MotCleDTO update(MotCleDTO MotCle) {
		// TODO Auto-generated method stub
		return convertEntityToDto( motCleRepository.save(convertDtoToEntity(MotCle)));
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		motCleRepository.deleteById(id);
	}
   
}
