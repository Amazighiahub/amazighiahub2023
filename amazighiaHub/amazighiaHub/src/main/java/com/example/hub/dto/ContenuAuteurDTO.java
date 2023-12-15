package com.example.hub.dto;

import com.example.hub.entity.Contenu;
import com.example.hub.entity.Utilisateur;



public class ContenuAuteurDTO {
	private Long idLien;
   
    private String nomUtilisateur ;
    private String prenomUtilisateur ;
	public ContenuAuteurDTO(Long idLien, Contenu contenu, Utilisateur utilisateur) {
		super();
		this.idLien = idLien;
	
	
	}
    
    public ContenuAuteurDTO() {}

	public Long getIdLien() {
		return idLien;
	}

	public void setIdLien(Long idLien) {
		this.idLien = idLien;
	}

	

	

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}

	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}

	@Override
	public String toString() {
		return "ContenuAuteurDTO [idLien=" + idLien +   "]";
	}
    
    
}
