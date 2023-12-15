package com.example.hub.service;

import java.util.List;

import com.example.hub.dto.UtilisateurDTO;
import com.example.hub.entity.Role;
import com.example.hub.entity.Utilisateur;

public interface UtilisateurService {
	Utilisateur convertDtoToEntity(UtilisateurDTO UtilisateurDto);

	UtilisateurDTO convertEntityToDto(Utilisateur Utilisateur);

	UtilisateurDTO findById(Long id);

	List<UtilisateurDTO> findAll();

	UtilisateurDTO save(Utilisateur Utilisateur);

	UtilisateurDTO update(Utilisateur Utilisateur);

	void deleteById(Long id);
	Utilisateur findUserByAdresseEmail (String email);
	Role addRole(Role role);
	Utilisateur addRoleToUser(String username, String rolename);

}
