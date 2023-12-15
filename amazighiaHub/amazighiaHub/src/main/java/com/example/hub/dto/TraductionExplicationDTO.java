package com.example.hub.dto;

import com.example.hub.entity.Langue;
import com.example.hub.entity.MotDifficile;



public class TraductionExplicationDTO {
	 private Long idTraductionExplication;

	
	    private MotDifficile motDifficile;

	    private Langue langue;
	    private String synonyme  ;
	    
	    public TraductionExplicationDTO() {}
		public TraductionExplicationDTO(Long idTraductionExplication, MotDifficile motDifficile, Langue langue,
				String synonyme) {
			super();
			this.idTraductionExplication = idTraductionExplication;
			this.motDifficile = motDifficile;
			this.langue = langue;
			this.synonyme = synonyme;
		}
		public Long getIdTraductionExplication() {
			return idTraductionExplication;
		}
		public void setIdTraductionExplication(Long idTraductionExplication) {
			this.idTraductionExplication = idTraductionExplication;
		}
		public MotDifficile getMotDifficile() {
			return motDifficile;
		}
		public void setMotDifficile(MotDifficile motDifficile) {
			this.motDifficile = motDifficile;
		}
		public Langue getLangue() {
			return langue;
		}
		public void setLangue(Langue langue) {
			this.langue = langue;
		}
		public String getSynonyme() {
			return synonyme;
		}
		public void setSynonyme(String synonyme) {
			this.synonyme = synonyme;
		}
		@Override
		public String toString() {
			return "TraductionExplicationDTO [idTraductionExplication=" + idTraductionExplication + ", motDifficile="
					+ motDifficile + ", langue=" + langue + ", synonyme=" + synonyme + "]";
		}
	    
	    
	    
}
