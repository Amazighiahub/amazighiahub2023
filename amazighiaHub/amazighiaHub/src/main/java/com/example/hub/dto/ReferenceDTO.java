package com.example.hub.dto;

import com.example.hub.entity.Contenu;
import com.example.hub.entity.Langue;



public class ReferenceDTO {
	private Long idReference;

    private Contenu contenu;

    
    private Langue langue;

    private String lienRessource;
    
    public ReferenceDTO() {}

	public ReferenceDTO(Long idReference, Contenu contenu, Langue langue, String lienRessource) {
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
		return "ReferenceDTO [idReference=" + idReference + ", contenu=" + contenu + ", langue=" + langue
				+ ", lienRessource=" + lienRessource + "]";
	}
    
    
    
}
