package com.example.hub.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hub.dto.ReferenceDTO;
import com.example.hub.entity.Reference;

import com.example.hub.repository.ReferenceRepository;


@Service
public class ReferenceServiceImpl implements ReferenceService {

	@Autowired
	ModelMapper modelMapper;

    
	  @Autowired
	  private ReferenceRepository referenceRepository;
    
    @Override
	public  Reference convertDtoToEntity(ReferenceDTO  referenceDto) {
		// TODO Auto-generated method stub
		
		 Reference reference = modelMapper.map(referenceDto, Reference.class);
		
		 return reference ;
	}

	 @Override
	public ReferenceDTO convertEntityToDto(Reference reference) {
		// TODO Auto-generated method stub
		ReferenceDTO referenceDTO = modelMapper.map(reference, ReferenceDTO.class);
		 return referenceDTO; 
	}

	@Override
	public ReferenceDTO findById(Long id) {
		// TODO Auto-generated method stub
		return convertEntityToDto(referenceRepository.getReferenceById(id));
	}

	@Override
	public List<ReferenceDTO> findAll() {
		// TODO Auto-generated method stub
		return referenceRepository.findAll().stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
	}

	@Override
	public ReferenceDTO save(Reference Reference) {
		// TODO Auto-generated method stub
		return convertEntityToDto( referenceRepository.save(Reference));
	}

	@Override
	public ReferenceDTO update(Reference reference) {
		// TODO Auto-generated method stub
		return convertEntityToDto( referenceRepository.save(reference));
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		referenceRepository.deleteById(id);
	}
}
