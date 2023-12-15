package com.example.hub.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



@Entity
@Table(name = "Traductions_Explications")
public class TraductionExplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTraductionExplication;

    @ManyToOne
    @JoinColumn(name = "idMotDifficile")
    private MotDifficile motDifficile;

    @ManyToOne
    @JoinColumn(name = "idLangue")
    private Langue langue;
    @Column(nullable = false, length = 60)
    private String synonyme ;

    // Getters and setters
    
    public TraductionExplication() {}

	public TraductionExplication(Long idTraductionExplication, MotDifficile motDifficile, Langue langue,
			String explicationTraduite) {
		super();
		this.idTraductionExplication = idTraductionExplication;
		this.motDifficile = motDifficile;
		this.langue = langue;
		this.synonyme = explicationTraduite;
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

	public String getExplicationTraduite() {
		return synonyme;
	}

	public void setExplicationTraduite(String synonyme) {
		this.synonyme = synonyme;
	}

	@Override
	public String toString() {
		return "TraductionExplication [idTraductionExplication=" + idTraductionExplication + ", motDifficile="
				+ motDifficile + ", langue=" + langue + ", explicationTraduite=" + synonyme + "]";
	}
    
    
}