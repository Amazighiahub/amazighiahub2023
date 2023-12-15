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
@Table(name = "Types_de_Contenu")
public class TypeContenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTypeContenu;
    @Column(nullable = false, length = 50)
    private String libelleType;
    @JsonIgnore
    @OneToMany(mappedBy = "typeContenu")
    private List<Contenu> contenus;
    public TypeContenu() {}

	public TypeContenu(Long idTypeContenu, String libelleType) {
		super();
		this.idTypeContenu = idTypeContenu;
		this.libelleType = libelleType;
	}

	public TypeContenu(String libelleType) {
		// TODO Auto-generated constructor stub
		this.libelleType = libelleType;
	}

	public Long getIdTypeContenu() {
		return idTypeContenu;
	}

	public void setIdTypeContenu(Long idTypeContenu) {
		this.idTypeContenu = idTypeContenu;
	}

	public String getLibelleType() {
		return libelleType;
	}

	public void setLibelleType(String libelleType) {
		this.libelleType = libelleType;
	}

	@Override
	public String toString() {
		return "TypeContenu [idTypeContenu=" + idTypeContenu + ", libelleType=" + libelleType + "]";
	}
    
    
    // Getters and setters
}
