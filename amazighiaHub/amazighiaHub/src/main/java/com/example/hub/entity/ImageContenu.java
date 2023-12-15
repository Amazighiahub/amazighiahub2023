package com.example.hub.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "imagesContenus")
public class ImageContenu {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long idLien;

	    @ManyToOne
	    @JoinColumn(name = "idContenu")
	    private Contenu contenu;

	    @ManyToOne
	    @JoinColumn(name = "idImage")
	    private Image image;
	    
	    
	    public ImageContenu() {}

		public ImageContenu(Long idLien, Contenu contenu, Image images) {
			super();
			this.idLien = idLien;
			this.contenu = contenu;
			this.image = images;
		}
		
		public ImageContenu( Contenu contenu, Image image) {
			super();
			
			this.contenu = contenu;
			this.image = image;
			
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

		public Image getDocuments() {
			return image;
		}

		public void setDocuments(Image image) {
			this.image = image;
		}

		@Override
		public String toString() {
			return "ImageContenu [idLien=" + idLien + ", contenu=" + contenu + ", image=" + image + "]";
		}
	    
	    
	    
}
