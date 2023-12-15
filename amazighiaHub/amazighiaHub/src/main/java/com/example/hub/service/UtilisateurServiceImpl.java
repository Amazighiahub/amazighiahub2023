package com.example.hub.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import org.springframework.stereotype.Service;

import com.example.hub.dto.UtilisateurDTO;
import com.example.hub.entity.Role;
import com.example.hub.entity.Utilisateur;
import com.example.hub.repository.RoleRepository;
import com.example.hub.repository.UtilisateurRepository;

import jakarta.transaction.Transactional;

@Transactional
@Service
@Lazy
public class UtilisateurServiceImpl implements UtilisateurService {

	@Autowired
	ModelMapper modelMapper;

    
	  @Autowired
	  private UtilisateurRepository utilisateurRepository;

	
	  @Autowired
	  private RoleRepository roleRepository;
    
    @Override
	public  Utilisateur convertDtoToEntity(UtilisateurDTO  utilisateurDto) {
		// TODO Auto-generated method stub
		
		 Utilisateur utilisateur = modelMapper.map(utilisateurDto, Utilisateur.class);
		
		 return utilisateur ;
	}

	 @Override
	public UtilisateurDTO convertEntityToDto(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		UtilisateurDTO utilisateurDTO = modelMapper.map(utilisateur, UtilisateurDTO.class);
		 return utilisateurDTO; 
	}

	@Override
	public UtilisateurDTO findById(Long id) {
		// TODO Auto-generated method stub
		return convertEntityToDto(utilisateurRepository.getReferenceById(id));
	}

	@Override
	public List<UtilisateurDTO> findAll() {
		// TODO Auto-generated method stub
		return utilisateurRepository.findAll().stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
	}

	@Override
	public UtilisateurDTO save(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return convertEntityToDto( utilisateurRepository.save(utilisateur));
	}

	@Override
	public UtilisateurDTO update(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return convertEntityToDto( utilisateurRepository.save(utilisateur));
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		utilisateurRepository.deleteById(id);
	}

	@Override
	public Utilisateur findUserByAdresseEmail(String email) {
		// TODO Auto-generated method stub
		return utilisateurRepository.findByAdresseEmail(email);
	}

	@Override
	public Role addRole(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public Utilisateur addRoleToUser(String email, String rolename) {
		// TODO Auto-generated method stub
		Utilisateur usr = utilisateurRepository.findByAdresseEmail(email);
		Role r = roleRepository.findByRole(rolename);
		usr.getRoles().add(r);
		return usr;
	}
}
