package com.example.hub.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Documents")
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDocument;

   
    
    @Column(nullable = false, length = 50)
    private String libelle ;

    // Autres champs pour les données du document (BLOB ou chemin du fichier)

    // Getters and setters
    
    public Document() {}

	public Document(Long idDocument, String libelle) {
		super();
		this.idDocument = idDocument;
	
		this.libelle = libelle;
	}
	public Document(  String libelle) {
		super();
		
		
		this.libelle = libelle;
	}

	public Long getIdDocument() {
		return idDocument;
	}

	public void setIdDocument(Long idDocument) {
		this.idDocument = idDocument;
	}

	

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Document [idDocument=" + idDocument +  ", libelle=" + libelle + "]";
	}
    
    
    
}
