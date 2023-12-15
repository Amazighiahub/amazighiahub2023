package com.example.hub.dto;

import java.time.LocalDate;

import com.example.hub.entity.Contenu;
import com.example.hub.entity.Utilisateur;



public class ValidationContenuDTO {
	
	private Long idValidation;
    private Contenu contenu;
    private Utilisateur utilisateur;
    private boolean statutValidation;
    private String commentairesValidation;
    private LocalDate dateValidation;
    
	public ValidationContenuDTO(Long idValidation, Contenu contenu, Utilisateur utilisateur, boolean statutValidation,
			String commentairesValidation, LocalDate dateValidation) {
		super();
		this.idValidation = idValidation;
		this.contenu = contenu;
		this.utilisateur = utilisateur;
		this.statutValidation = statutValidation;
		this.commentairesValidation = commentairesValidation;
		this.dateValidation = dateValidation;
	}
    public ValidationContenuDTO() {}
	public Long getIdValidation() {
		return idValidation;
	}
	public void setIdValidation(Long idValidation) {
		this.idValidation = idValidation;
	}
	public Contenu getContenu() {
		return contenu;
	}
	public void setContenu(Contenu contenu) {
		this.contenu = contenu;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public boolean getStatutValidation() {
		return statutValidation;
	}
	public void setStatutValidation(boolean statutValidation) {
		this.statutValidation = statutValidation;
	}
	public String getCommentairesValidation() {
		return commentairesValidation;
	}
	public void setCommentairesValidation(String commentairesValidation) {
		this.commentairesValidation = commentairesValidation;
	}
	public LocalDate getDateValidation() {
		return dateValidation;
	}
	public void setDateValidation(LocalDate dateValidation) {
		this.dateValidation = dateValidation;
	}
	@Override
	public String toString() {
		return "ValidationContenuDTO [idValidation=" + idValidation + ", contenu=" + contenu + ", utilisateur="
				+ utilisateur + ", statutValidation=" + statutValidation + ", commentairesValidation="
				+ commentairesValidation + ", dateValidation=" + dateValidation + "]";
	}
    
    
    
    
}
