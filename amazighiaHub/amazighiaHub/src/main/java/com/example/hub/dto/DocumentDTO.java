package com.example.hub.dto;

public class DocumentDTO {

    private Long idDocument;
 
    private String libelle;

    public DocumentDTO() {
    }

    public DocumentDTO(Long idDocument,  String libelle) {
        this.idDocument = idDocument;
 
        this.libelle = libelle;
    }

    // Getters et setters

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
        return "DocumentDTO [idDocument=" + idDocument + ", libelle=" + libelle + "]";
    }
}
