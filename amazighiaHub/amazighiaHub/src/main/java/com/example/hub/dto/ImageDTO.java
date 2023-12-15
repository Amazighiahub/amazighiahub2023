package com.example.hub.dto;



public class ImageDTO {
	private Long idImage;

    private String libelle ;

	public ImageDTO(Long idImage, String libelle) {
		super();
		this.idImage = idImage;
		this.libelle = libelle;
	}
    
    public ImageDTO() {}

	public Long getIdImage() {
		return idImage;
	}

	public void setIdImage(Long idImage) {
		this.idImage = idImage;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "ImageDTO [idImage=" + idImage + ", libelle=" + libelle + "]";
	}
    
    
    
}
