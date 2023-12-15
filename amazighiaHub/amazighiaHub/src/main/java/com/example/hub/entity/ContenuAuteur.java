package com.example.hub.entity;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "Contenus_Auteurs")
public class ContenuAuteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLien;

    @ManyToOne
    @JoinColumn(name = "idContenu")
    private Contenu contenu;

    @ManyToOne
    @JoinColumn(name = "idUtilisateur")
    private Utilisateur utilisateur;

    // Getters and sette
    public ContenuAuteur() {}

	public ContenuAuteur(Long idLien, Contenu contenu, Utilisateur utilisateur) {
		super();
		this.idLien = idLien;
		this.contenu = contenu;
		this.utilisateur = utilisateur;
	}

	public Long getIdLien() {
		return idLien;
	}

	public void setIdLien(Long idLien) {
		this.idLien = idLien;
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

	@Override
	public String toString() {
		return "ContenuAuteur [idLien=" + idLien + ", contenu=" + contenu + ", utilisateur=" + utilisateur + "]";
	}
    
    
    
    
    
}