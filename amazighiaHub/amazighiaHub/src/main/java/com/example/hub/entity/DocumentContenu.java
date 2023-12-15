package com.example.hub.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
@Entity
@Table(name = "documentsContenus")
public class DocumentContenu {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long idLien;

	    @ManyToOne
	    @JoinColumn(name = "idContenu")
	    private Contenu contenu;

	    @ManyToOne
	    @JoinColumn(name = "idDocument")
	    private Document document;
	    
	    
	    public DocumentContenu() {}

		public DocumentContenu(Long idLien, Contenu contenu, Document document) {
			super();
			this.idLien = idLien;
			this.contenu = contenu;
			this.document = document;
		}
		
		public DocumentContenu( Contenu contenu, Document document) {
			super();
			
			this.contenu = contenu;
			this.document = document;
			
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

		public Document getDocuments() {
			return document;
		}

		public void setDocuments(Document document) {
			this.document = document;
		}

		@Override
		public String toString() {
			return "DocumentContenu [idLien=" + idLien + ", contenu=" + contenu + ", document=" + document + "]";
		}
	    
	    
	    
}
