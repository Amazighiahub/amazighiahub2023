package com.example.hub.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Entity
@Table(name = "Images")
public class Image {

  

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idImage;

   
    @Column(nullable = false, length = 50)
    private String libelle ;

    // Autres champs pour les données de l'image (BLOB ou chemin du fichier)

    // Getters and setters
    
    public Image() {}
    
   

	public Image(Long idImage, Contenu contenu, String libelle) {
		super();
		this.idImage = idImage;
	
		this.libelle = libelle;
	}
	public Image( Contenu contenu, String libelle) {
		super();
		
		
		this.libelle = libelle;
	}


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
		return "Image [idImage=" + idImage + ", libelle=" + libelle + "]";
	}


    
    
   
    
    
}
