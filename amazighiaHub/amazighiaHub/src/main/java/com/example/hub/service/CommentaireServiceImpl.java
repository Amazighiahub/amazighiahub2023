package com.example.hub.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hub.dto.CommentaireDTO;
import com.example.hub.entity.Commentaire;
import com.example.hub.repository.CommentaireRepository;

@Service
public class CommentaireServiceImpl implements CommentaireService {
	@Autowired
	ModelMapper modelMapper;

    
	  @Autowired
	  private CommentaireRepository commentaireRepository;
    

	  
	  
	

    @Override
	public  Commentaire convertDtoToEntity(CommentaireDTO  commentaireDto) {
		// TODO Auto-generated method stub
		
		 Commentaire commentaire = modelMapper.map(commentaireDto, Commentaire.class);
		
		 return commentaire ;
	}

	 @Override
	public CommentaireDTO convertEntityToDto(Commentaire commentaire) {
		// TODO Auto-generated method stub
		CommentaireDTO commentaireDTO = modelMapper.map(commentaire, CommentaireDTO.class);
		 return commentaireDTO; 
	}

	@Override
	public CommentaireDTO findById(Long id) {
		// TODO Auto-generated method stub
		return convertEntityToDto(commentaireRepository.getReferenceById(id));
	}

	@Override
	public List<CommentaireDTO> findAll() {
		// TODO Auto-generated method stub
		return commentaireRepository.findAll().stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
	}

	@Override
	public CommentaireDTO save(CommentaireDTO commentaire) {
		// TODO Auto-generated method stub
		return convertEntityToDto( commentaireRepository.save(convertDtoToEntity(commentaire)));
	}

	@Override
	public CommentaireDTO update(CommentaireDTO commentaire) {
		// TODO Auto-generated method stub
		return convertEntityToDto( commentaireRepository.save(convertDtoToEntity(commentaire)));
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		commentaireRepository.deleteById(id);
	}
}
