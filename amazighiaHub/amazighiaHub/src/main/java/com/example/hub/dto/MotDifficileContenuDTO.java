package com.example.hub.dto;






public class MotDifficileContenuDTO {
	private Long idLien;

   
    private ContenuDTO contenu;

   
    private MotDifficileDTO motDifficile;


	public MotDifficileContenuDTO(Long idLien, ContenuDTO contenu, MotDifficileDTO motDifficile) {
		super();
		this.idLien = idLien;
		this.contenu = contenu;
		this.motDifficile = motDifficile;
	}
    public MotDifficileContenuDTO() {}
	public Long getIdLien() {
		return idLien;
	}
	public void setIdLien(Long idLien) {
		this.idLien = idLien;
	}
	public ContenuDTO getContenu() {
		return contenu;
	}
	public void setContenu(ContenuDTO contenu) {
		this.contenu = contenu;
	}
	public MotDifficileDTO getMotDifficile() {
		return motDifficile;
	}
	public void setMotDifficile(MotDifficileDTO motDifficile) {
		this.motDifficile = motDifficile;
	}
	@Override
	public String toString() {
		return "MotDifficileContenuDTO [idLien=" + idLien + ", contenu=" + contenu + ", motDifficile=" + motDifficile
				+ "]";
	}
    
    
    
    
    
}
