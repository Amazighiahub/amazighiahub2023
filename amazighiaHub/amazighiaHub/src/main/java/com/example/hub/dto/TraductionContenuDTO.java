package com.example.hub.dto;

import java.time.LocalDate;



public class TraductionContenuDTO {

	
	 private Long idTraduction;

	  
	    private LangueDTO langue;
	    
	   
	    private UtilisateurDTO utilisateur;

	    private String texteTraduit;

	 
	    private LocalDate dateTraduction;

	    public TraductionContenuDTO() {}
	    
		public TraductionContenuDTO(Long idTraduction, LangueDTO langue, UtilisateurDTO utilisateur,
				String texteTraduit, LocalDate dateTraduction) {
			super();
			this.idTraduction = idTraduction;
			
			this.langue = langue;
			this.utilisateur = utilisateur;
			this.texteTraduit = texteTraduit;
			this.dateTraduction = dateTraduction;
		}

		public Long getIdTraduction() {
			return idTraduction;
		}

		public void setIdTraduction(Long idTraduction) {
			this.idTraduction = idTraduction;
		}

	

		public LangueDTO getLangue() {
			return langue;
		}

		public void setLangue(LangueDTO langue) {
			this.langue = langue;
		}

		public UtilisateurDTO getUtilisateur() {
			return utilisateur;
		}

		public void setUtilisateur(UtilisateurDTO utilisateur) {
			this.utilisateur = utilisateur;
		}

		public String getTexteTraduit() {
			return texteTraduit;
		}

		public void setTexteTraduit(String texteTraduit) {
			this.texteTraduit = texteTraduit;
		}

		public LocalDate getDateTraduction() {
			return dateTraduction;
		}

		public void setDateTraduction(LocalDate dateTraduction) {
			this.dateTraduction = dateTraduction;
		}

		@Override
		public String toString() {
			return "TraductionContenuDTO [idTraduction=" + idTraduction  + ", langue=" + langue
					+ ", utilisateur=" + utilisateur + ", texteTraduit=" + texteTraduit + ", dateTraduction="
					+ dateTraduction + "]";
		}
	    
		
	    
	    
}
