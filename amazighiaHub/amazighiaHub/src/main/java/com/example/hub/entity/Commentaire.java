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
@Table(name = "Commentaires")
public class Commentaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommentaire;

    @ManyToOne
    @JoinColumn(name = "idContenu")
    private Contenu contenu;

    @ManyToOne
    @JoinColumn(name = "idUtilisateur")
    private Utilisateur utilisateur;

    @Column(columnDefinition = "TEXT")
    private String texteCommentaire;
    
   
    private LocalDate dateCommentaire;
    
    public Commentaire() {}

	public Commentaire(Long idCommentaire, Contenu contenu, Utilisateur utilisateur, String texteCommentaire,
			LocalDate dateCommentaire) {
		super();
		this.idCommentaire = idCommentaire;
		this.contenu = contenu;
		this.utilisateur = utilisateur;
		this.texteCommentaire = texteCommentaire;
		this.dateCommentaire = dateCommentaire;
	}
	
	public Commentaire( Contenu contenu, Utilisateur utilisateur, String texteCommentaire,
			LocalDate dateCommentaire) {
		super();
		
		this.contenu = contenu;
		this.utilisateur = utilisateur;
		this.texteCommentaire = texteCommentaire;
		this.dateCommentaire = dateCommentaire;
	}

	public Long getIdCommentaire() {
		return idCommentaire;
	}

	public void setIdCommentaire(Long idCommentaire) {
		this.idCommentaire = idCommentaire;
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

	public String getTexteCommentaire() {
		return texteCommentaire;
	}

	public void setTexteCommentaire(String texteCommentaire) {
		this.texteCommentaire = texteCommentaire;
	}

	public LocalDate getDateCommentaire() {
		return dateCommentaire;
	}

	public void setDateCommentaire(LocalDate dateCommentaire) {
		this.dateCommentaire = dateCommentaire;
	}

	@Override
	public String toString() {
		return "Commentaire [idCommentaire=" + idCommentaire + ", contenu=" + contenu + ", utilisateur=" + utilisateur
				+ ", texteCommentaire=" + texteCommentaire + ", dateCommentaire=" + dateCommentaire + "]";
	}
    
    

    
    
}
    
    
