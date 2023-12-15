package com.example.hub.entity;


import java.time.LocalDate;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "Contenus")
public class Contenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContenu;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String texteContenu;

    @Column(nullable = true)
    private String titre;
    
    @Column(nullable = true)
    private String edition;
  
    private LocalDate dateSoumission;
    @ManyToOne
    @JoinColumn(name = "idLangue")
    private Langue langue;
    @OneToMany(mappedBy = "contenu", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<TraductionContenu> traductions;
    @ManyToOne
    @JoinColumn(name = "idTypeContenu")
    private TypeContenu typeContenu;
    @ManyToOne
    @JoinColumn(name = "idUtilisateur")
    private Utilisateur utilisateur;
	@JsonIgnore
    @OneToMany(mappedBy = "contenu")
    private List<Commentaire> commentaires;
    
    @OneToMany(mappedBy = "contenu", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ContenuAuteur> auteurs;
    
    @OneToMany(mappedBy = "contenu", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ContenuAuteur> images;
    
    public List<ContenuAuteur> getAuteurs() {
		return auteurs;
	}

	public void setAuteurs(List<ContenuAuteur> auteurs) {
		this.auteurs = auteurs;
	}



    // Getters and setters
    
    public Contenu() {}

	public List<TraductionContenu> getTraductions() {
		return traductions;
	}

	public void setTraductions(List<TraductionContenu> traductions) {
		this.traductions = traductions;
	}

	

	public Contenu(Long idContenu, String texteContenu, String resume, LocalDate dateSoumission, Langue langue,
			TypeContenu typeContenu, Utilisateur utilisateur, String edition) {
		super();
		this.idContenu = idContenu;
		this.texteContenu = texteContenu;
		this.titre = resume;
		this.dateSoumission = dateSoumission;
		this.langue = langue;
		this.typeContenu = typeContenu;
		this.utilisateur = utilisateur;
		this.edition = edition ;
	}
	public Contenu( String texteContenu, String resume, LocalDate dateSoumission, Langue langue,
			TypeContenu typeContenu, Utilisateur utilisateur, String edition) {
		super();
		
		this.texteContenu = texteContenu;
		this.titre = resume;
		this.dateSoumission = dateSoumission;
		this.langue = langue;
		this.typeContenu = typeContenu;
		this.utilisateur = utilisateur;
		this.edition = edition ;
	}

	public Long getIdContenu() {
		return idContenu;
	}

	public void setIdContenu(Long idContenu) {
		this.idContenu = idContenu;
	}

	public String getTexteContenu() {
		return texteContenu;
	}

	public void setTexteContenu(String texteContenu) {
		this.texteContenu = texteContenu;
	}

	public String getResume() {
		return titre;
	}

	public void setResume(String titre) {
		this.titre = titre;
	}

	public LocalDate getDateSoumission() {
		return dateSoumission;
	}

	public void setDateSoumission(LocalDate dateSoumission) {
		this.dateSoumission = dateSoumission;
	}

	public Langue getLangue() {
		return langue;
	}

	public void setLangue(Langue langue) {
		this.langue = langue;
	}

	public TypeContenu getTypeContenu() {
		return typeContenu;
	}

	public void setTypeContenu(TypeContenu typeContenu) {
		this.typeContenu = typeContenu;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public List<Commentaire> getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(List<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}

	@Override
	public String toString() {
		return "Contenu [idContenu=" + idContenu + ", texteContenu=" + texteContenu + ", titre=" + titre
				+ ", dateSoumission=" + dateSoumission + ", langue=" + langue + ", typeContenu=" + typeContenu
				+ ", utilisateur=" + utilisateur + "]";
	}
    
    
}