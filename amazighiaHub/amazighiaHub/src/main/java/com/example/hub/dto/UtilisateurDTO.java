package com.example.hub.dto;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurDTO {
    private Long idUtilisateur;
    private String nomUtilisateur;
    private String prenom;
    private String adresseEmail;
    private String role;
    private List<CommentaireDTO> commentaires;
  
    public UtilisateurDTO() {}
    public UtilisateurDTO(Long idUtilisateur, String nomUtilisateur, String prenom, String adresseEmail, String role) {
        this.idUtilisateur = idUtilisateur;
        this.nomUtilisateur = nomUtilisateur;
        this.prenom = prenom;
        this.adresseEmail = adresseEmail;
        this.role = role;
        this.commentaires = new ArrayList<>();
      
    }

	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresseEmail() {
		return adresseEmail;
	}

	public void setAdresseEmail(String adresseEmail) {
		this.adresseEmail = adresseEmail;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<CommentaireDTO> getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(List<CommentaireDTO> commentaires) {
		this.commentaires = commentaires;
	}



	@Override
	public String toString() {
		return "UtilisateurDTO [idUtilisateur=" + idUtilisateur + ", nomUtilisateur=" + nomUtilisateur + ", prenom="
				+ prenom + ", adresseEmail=" + adresseEmail + ", role=" + role + ", commentaires=" + commentaires
				+  "]";
	}

    
    
    // Getters et setters
}
