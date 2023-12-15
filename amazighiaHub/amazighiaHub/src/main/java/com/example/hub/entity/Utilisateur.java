package com.example.hub.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name = "Utilisateurs")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUtilisateur;
    @Column(nullable = false, length = 60)
    private String nomUtilisateur;
    @Column(nullable = false, length = 60)
    private String prenom ;
    @Column(nullable = true, length = 60 ,unique = true)
    private String adresseEmail;
    @Column(nullable = true, length = 250)
    private String motDePasse;
    @ManyToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name="user_role",joinColumns = @JoinColumn(name="user_id") , 
     inverseJoinColumns = @JoinColumn(name="role_id")) 
    private List<Role> roles;
    private Boolean enabled;
   
    public Boolean getEnabled() {
		return enabled;
	}


	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	@JsonIgnore
    @OneToMany(mappedBy = "utilisateur")
    private List<Commentaire> commentaires;
   
    
public Utilisateur(String nomUtilisateur, String prenom, String adresseEmail, String motDePasse) {
		super();
		this.nomUtilisateur = nomUtilisateur;
		this.prenom = prenom;
		this.adresseEmail = adresseEmail;
		this.motDePasse = motDePasse;
		
	}


public Utilisateur() {}


public Long getIdUtilisateur() {
	return idUtilisateur;
}


public List<Commentaire> getCommentaires() {
	return commentaires;
}

public void setCommentaires(List<Commentaire> commentaires) {
	this.commentaires = commentaires;
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
public String getMotDePasse() {
	return motDePasse;
}
public void setMotDePasse(String motDePasse) {
	this.motDePasse = motDePasse;
}

public List<Role> getRoles() {
	return roles;
}

public void setRoles(List<Role> roles) {
	this.roles = roles;
}

@Override
public String toString() {
	return "Utilisateur [idUtilisateur=" + idUtilisateur + ", nomUtilisateur=" + nomUtilisateur + ", prenom=" + prenom
			+ ", adresseEmail=" + adresseEmail + ", motDePasse=" + motDePasse + ", roles=" + roles + ", commentaires="
			+ commentaires + "]";
}





    // Getters and setters
}
