package com.example.hub.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hub.dto.ContenuDTO;
import com.example.hub.dto.TraductionContenuDTO;
import com.example.hub.dto.UtilisateurDTO;
import com.example.hub.entity.Contenu;
import com.example.hub.entity.TraductionContenu;
import com.example.hub.repository.ContenuRepository;
import com.example.hub.repository.TraductionContenuRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class ContenuServiceImpl implements ContenuService {

	@Autowired
	ModelMapper modelMapper;

    
	  @Autowired
	  private ContenuRepository contenuRepository;
	  @Autowired
	  private UtilisateurService utilisateurService ;

	  @Autowired
	private TraductionContenuRepository traductionContenuRepository;
    
	  @Autowired
		private TraductionContenuServiceImpl traductionContenuService;
	  
	  
	

    @Override
	public  Contenu convertDtoToEntity(ContenuDTO  contenuDto) {
		// TODO Auto-generated method stub
		
		 Contenu contenu = modelMapper.map(contenuDto, Contenu.class);
		
		 return contenu ;
	}

	 @Override
	public ContenuDTO convertEntityToDto(Contenu contenu) {
		// TODO Auto-generated method stub
		ContenuDTO contenuDTO = modelMapper.map(contenu, ContenuDTO.class);
		 return contenuDTO; 
	}

	@Override
	public ContenuDTO findById(Long id) {
		// TODO Auto-generated method stub
		return convertEntityToDto(contenuRepository.getReferenceById(id));
	}

	@Override
	public List<ContenuDTO> findAll() {
		// TODO Auto-generated method stub
		return contenuRepository.findAll().stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
	}

	@Override
	public ContenuDTO save(ContenuDTO contenu) {
		// TODO Auto-generated method stub
		return convertEntityToDto( contenuRepository.save(convertDtoToEntity(contenu)));
	}

	@Override
	public ContenuDTO update(ContenuDTO contenu) {
		// TODO Auto-generated method stub
		return convertEntityToDto( contenuRepository.save(convertDtoToEntity(contenu)));
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		contenuRepository.deleteById(id);
	}
	
	@Override
	public List<ContenuDTO> getAllContenusWithTranslations() {
	    List<Contenu> contenus = contenuRepository.findAll();
	    List<ContenuDTO> contenuDTOs = new ArrayList<>();

	    for (Contenu contenu : contenus) {
	        List<TraductionContenu> traductions = traductionContenuRepository.findByContenu(contenu);
	        
	        List<TraductionContenuDTO> traductionDTOs = traductions.stream().map(traductionContenuService::convertEntityToDto).collect(Collectors.toList());

	        ContenuDTO contenuDTO = this.convertEntityToDto(contenu);
	        contenuDTO.setTraductions(traductionDTOs);

	        contenuDTOs.add(contenuDTO);
	    }
	return   contenuDTOs ;
	}
  @Override
	public List<ContenuDTO> findByUser(Long id) {
		// TODO Auto-generated method stub
	  UtilisateurDTO utilisateur = utilisateurService.findById(id);
		return  contenuRepository.findByUtilisateur(utilisateurService.convertDtoToEntity(utilisateur)).stream().map(this::convertEntityToDto).collect(Collectors.toList());
	
	}

}
