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
@Table(name = "Traductions_contenu")
public class TraductionContenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTraduction;

    @ManyToOne
    @JoinColumn(name = "idContenu")
    private Contenu contenu;

    @ManyToOne
    @JoinColumn(name = "idLangue")
    private Langue langue;
    
    @ManyToOne
    @JoinColumn(name = "idUtilisateur")
    private Utilisateur utilisateur;

    @Column(columnDefinition = "TEXT")
    private String texteTraduit;

 
    private LocalDate dateTraduction;

    // Getters and setters
    public TraductionContenu() {}

	public TraductionContenu(Long idTraduction, Contenu contenu, Langue langue, Utilisateur utilisateur,
			String texteTraduit, LocalDate dateTraduction) {
		super();
		this.idTraduction = idTraduction;
		this.contenu = contenu;
		this.langue = langue;
		this.utilisateur = utilisateur;
		this.texteTraduit = texteTraduit;
		this.dateTraduction = dateTraduction;
	}
    
	public TraductionContenu( Contenu contenu, Langue langue, Utilisateur utilisateur,
			String texteTraduit, LocalDate dateTraduction) {
		super();
	
		this.contenu = contenu;
		this.langue = langue;
		this.utilisateur = utilisateur;
		this.texteTraduit = texteTraduit;
		this.dateTraduction = dateTraduction;
	}

	public Long getIdTraduction() {
		return idTraduction;
	}

	public void setIdTraduction(Long idTraduction) {
		this.idTraduction = idTraduction;
	}

	public Contenu getContenu() {
		return contenu;
	}

	public void setContenu(Contenu contenu) {
		this.contenu = contenu;
	}

	public Langue getLangue() {
		return langue;
	}

	public void setLangue(Langue langue) {
		this.langue = langue;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public String getTexteTraduit() {
		return texteTraduit;
	}

	public void setTexteTraduit(String texteTraduit) {
		this.texteTraduit = texteTraduit;
	}

	public LocalDate getDateTraduction() {
		return dateTraduction;
	}

	public void setDateTraduction(LocalDate dateTraduction) {
		this.dateTraduction = dateTraduction;
	}

	@Override
	public String toString() {
		return "TraductionContenu [idTraduction=" + idTraduction + ", contenu=" + contenu + ", langue=" + langue
				+ ", utilisateur=" + utilisateur + ", texteTraduit=" + texteTraduit + ", dateTraduction="
				+ dateTraduction + "]";
	}
    
	
    
    
}
