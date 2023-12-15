package com.example.hub.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;




@Entity
@Table(name = "MotsDifficiles_Contenus")
public class MotDifficileContenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLien;

    @ManyToOne
    @JoinColumn(name = "idContenu")
    private Contenu contenu;

    @ManyToOne
    @JoinColumn(name = "idMotDifficile")
    private MotDifficile motDifficile;
    
    
    public MotDifficileContenu() {}

	public MotDifficileContenu(Long idLien, Contenu contenu, MotDifficile motDifficile) {
		super();
		this.idLien = idLien;
		this.contenu = contenu;
		this.motDifficile = motDifficile;
	}

	public MotDifficileContenu( Contenu contenu, MotDifficile motDifficile) {
		super();
	
		this.contenu = contenu;
		this.motDifficile = motDifficile;
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

	public MotDifficile getMotDifficile() {
		return motDifficile;
	}

	public void setMotDifficile(MotDifficile motDifficile) {
		this.motDifficile = motDifficile;
	}

	@Override
	public String toString() {
		return "MotDifficileContenu [idLien=" + idLien + ", contenu=" + contenu + ", motDifficile=" + motDifficile
				+ "]";
	}
    
    
    
    
    
    

    
}