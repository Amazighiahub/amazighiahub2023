package com.example.hub.dto;

import com.example.hub.entity.Langue;



public class MotDifficileDTO {
	
	private Long idMotDifficile;
    private String motDifficile;
    private Langue langue;


	public MotDifficileDTO(Long idMotDifficile, String motDifficile, Langue langue) {
		super();
		this.idMotDifficile = idMotDifficile;
		this.motDifficile = motDifficile;
		this.langue = langue;
	}
    
    
    public MotDifficileDTO() {}


	public Long getIdMotDifficile() {
		return idMotDifficile;
	}


	public void setIdMotDifficile(Long idMotDifficile) {
		this.idMotDifficile = idMotDifficile;
	}


	public String getMotDifficile() {
		return motDifficile;
	}


	public void setMotDifficile(String motDifficile) {
		this.motDifficile = motDifficile;
	}


	public Langue getLangue() {
		return langue;
	}


	public void setLangue(Langue langue) {
		this.langue = langue;
	}


	@Override
	public String toString() {
		return "MotDifficileDTO [idMotDifficile=" + idMotDifficile + ", motDifficile=" + motDifficile + ", langue="
				+ langue + "]";
	}


    
}
