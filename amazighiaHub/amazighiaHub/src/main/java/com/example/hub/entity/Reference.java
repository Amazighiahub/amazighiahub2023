package com.example.hub.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



@Entity
@Table(name = "`References`")
public class Reference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReference;

    @ManyToOne
    @JoinColumn(name = "idContenu")
    private Contenu contenu;

    @ManyToOne
    @JoinColumn(name = "idLangue")
    private Langue langue;

   
    private String lienRessource;
    
    
    public Reference() {}
    
    
    


	public Reference(Long idReference, Contenu contenu, Langue langue, String lienRessource) {
		super();
		this.idReference = idReference;
		this.contenu = contenu;
		this.langue = langue;
		this.lienRessource = lienRessource;
	}





	public Long getIdReference() {
		return idReference;
	}


	public void setIdReference(Long idReference) {
		this.idReference = idReference;
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


	public String getLienRessource() {
		return lienRessource;
	}


	public void setLienRessource(String lienRessource) {
		this.lienRessource = lienRessource;
	}





	@Override
	public String toString() {
		return "Reference [idReference=" + idReference + ", contenu=" + contenu + ", langue=" + langue
				+ ", lienRessource=" + lienRessource + "]";
	}
    
    
    
}