package com.example.hub.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;






@Entity
@Table(name = "MotsCles_Contenus")
public class MotCleContenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLien;

    @ManyToOne
    @JoinColumn(name = "idContenu")
    private Contenu contenu;

    @ManyToOne
    @JoinColumn(name = "idMotCle")
    private MotCle motCle;

    // Getters and setters
    
    
    public MotCleContenu() {}

	public MotCleContenu(Long idLien, Contenu contenu, MotCle motCle) {
		super();
		this.idLien = idLien;
		this.contenu = contenu;
		this.motCle = motCle;
	}
	
	public MotCleContenu( Contenu contenu, MotCle motCle) {
		super();
		
		this.contenu = contenu;
		this.motCle = motCle;
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

	public MotCle getMotCle() {
		return motCle;
	}

	public void setMotCle(MotCle motCle) {
		this.motCle = motCle;
	}

	@Override
	public String toString() {
		return "MotCleContenu [idLien=" + idLien + ", contenu=" + contenu + ", motCle=" + motCle + "]";
	}
    
    
}