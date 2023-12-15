package com.example.hub.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Langues")
public class Langue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLangue;
    @Column(nullable = false, length = 40)
    private String nomLangue;
    @JsonIgnore
    @OneToMany(mappedBy = "langue")
    private List<Contenu> contenus;
    // Getters and setters
    public Langue() {}

	public Langue(Long idLangue, String nomLangue) {
		super();
		this.idLangue = idLangue;
		this.nomLangue = nomLangue;
	}

	public Langue(String nom) {
		// TODO Auto-generated constructor stub
		this.nomLangue = nom ;
	}

	public Long getIdLangue() {
		return idLangue;
	}

	public void setIdLangue(Long idLangue) {
		this.idLangue = idLangue;
	}

	public String getNomLangue() {
		return nomLangue;
	}

	public void setNomLangue(String nomLangue) {
		this.nomLangue = nomLangue;
	}

	@Override
	public String toString() {
		return "Langue [idLangue=" + idLangue + ", nomLangue=" + nomLangue + "]";
	}
    
}
