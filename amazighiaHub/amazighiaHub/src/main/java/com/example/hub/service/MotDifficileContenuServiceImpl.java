package com.example.hub.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hub.dto.MotDifficileContenuDTO;
import com.example.hub.entity.MotDifficileContenu;

import com.example.hub.repository.MotDifficileContenuRepository;


@Service
public class MotDifficileContenuServiceImpl implements MotDifficileContenuService {
	@Autowired
	ModelMapper modelMapper;

    
	  @Autowired
	  private MotDifficileContenuRepository motDifficileContenuRepository;
    
    @Override
	public  MotDifficileContenu convertDtoToEntity(MotDifficileContenuDTO  motDifficileContenuDto) {
		// TODO Auto-generated method stub
		
		 MotDifficileContenu motDifficileContenu = modelMapper.map(motDifficileContenuDto, MotDifficileContenu.class);
		
		 return motDifficileContenu ;
	}

	 @Override
	public MotDifficileContenuDTO convertEntityToDto(MotDifficileContenu motDifficileContenu) {
		// TODO Auto-generated method stub
		MotDifficileContenuDTO motDifficileContenuDTO = modelMapper.map(motDifficileContenu, MotDifficileContenuDTO.class);
		 return motDifficileContenuDTO; 
	}

	@Override
	public MotDifficileContenuDTO findById(Long id) {
		// TODO Auto-generated method stub
		return convertEntityToDto(motDifficileContenuRepository.getReferenceById(id));
	}

	@Override
	public List<MotDifficileContenuDTO> findAll() {
		// TODO Auto-generated method stub
		return motDifficileContenuRepository.findAll().stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
	}

	@Override
	public MotDifficileContenuDTO save(MotDifficileContenu MotDifficileContenu) {
		// TODO Auto-generated method stub
		return convertEntityToDto( motDifficileContenuRepository.save(MotDifficileContenu));
	}

	@Override
	public MotDifficileContenuDTO update(MotDifficileContenu MotDifficileContenu) {
		// TODO Auto-generated method stub
		return convertEntityToDto( motDifficileContenuRepository.save(MotDifficileContenu));
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		motDifficileContenuRepository.deleteById(id);
	}
}

