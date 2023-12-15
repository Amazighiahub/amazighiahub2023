package com.example.hub.entity;


import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



@Entity
@Table(name = "ValidationContenus")
public class ValidationContenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idValidation;

    @ManyToOne
    @JoinColumn(name = "idContenu")
    private Contenu contenu;

    @ManyToOne
    @JoinColumn(name = "idUtilisateur")
    private Utilisateur utilisateur;
    
    @Column(nullable = false)
    private boolean statutValidation;
    @Column(nullable = false, length = 40)
    private String commentairesValidation;
    private LocalDate dateValidation;

    // Getters and setters
    
    public ValidationContenu() {}

	public ValidationContenu(Long idValidation, Contenu contenu, Utilisateur utilisateur, boolean statutValidation,
			String commentairesValidation, LocalDate dateValidation) {
		super();
		this.idValidation = idValidation;
		this.contenu = contenu;
		this.utilisateur = utilisateur;
		this.statutValidation = statutValidation;
		this.commentairesValidation = commentairesValidation;
		this.dateValidation = dateValidation;
	}
    
	public ValidationContenu( Contenu contenu, Utilisateur utilisateur, boolean statutValidation,
			String commentairesValidation, LocalDate dateValidation) {
		super();
		
		this.contenu = contenu;
		this.utilisateur = utilisateur;
		this.statutValidation = statutValidation;
		this.commentairesValidation = commentairesValidation;
		this.dateValidation = dateValidation;
	}

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
		return "ValidationContenu [idValidation=" + idValidation + ", contenu=" + contenu + ", utilisateur="
				+ utilisateur + ", statutValidation=" + statutValidation + ", commentairesValidation="
				+ commentairesValidation + ", dateValidation=" + dateValidation + "]";
	}
	
	
	
    
    
}
