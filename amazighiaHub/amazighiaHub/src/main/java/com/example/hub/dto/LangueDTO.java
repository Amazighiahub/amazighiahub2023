package com.example.hub.dto;

import java.util.ArrayList;
import java.util.List;

public class LangueDTO {
	
    private Long idLangue;
   
    private String nomLangue;
    
    private List<ContenuDTO> contenus;
    // Getters and setters
    public  LangueDTO() {}
	public LangueDTO(Long idLangue, String nomLangue) {
		super();
		this.idLangue = idLangue;
		this.nomLangue = nomLangue;
		 contenus  = new ArrayList<>();
	
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
	public List<ContenuDTO> getContenus() {
		return contenus;
	}
	public void setContenus(List<ContenuDTO> contenus) {
		this.contenus = contenus;
	}
	@Override
	public String toString() {
		return "LangueDTO [idLangue=" + idLangue + ", nomLangue=" + nomLangue + ", contenus=" + contenus + "]";
	}
    
    

}
