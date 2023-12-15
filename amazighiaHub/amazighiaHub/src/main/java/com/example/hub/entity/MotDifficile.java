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
@Table(name = "Mots_Difficiles")
public class MotDifficile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMotDifficile;
    @Column(nullable = false, length = 50)
    private String motDifficile;

    @ManyToOne
    @JoinColumn(name = "idLangue")
    private Langue langue;

    public MotDifficile() {}

	public MotDifficile(Long idMotDifficile, String motDifficile, Langue langue) {
		super();
		this.idMotDifficile = idMotDifficile;
		this.motDifficile = motDifficile;
		this.langue = langue;
	}

	public Long getIdMotDifficile() {
		return idMotDifficile;
	}

	public void setIdMotDifficile(Long idMotDifficile) {
		this.idMotDifficile = idMotDifficile;
	}

	public String getMotDifficile() {
		return motDifficile;
	}

	public void setMotDifficile(String motDifficile) {
		this.motDifficile = motDifficile;
	}

	public Langue getLangue() {
		return langue;
	}

	public void setLangue(Langue langue) {
		this.langue = langue;
	}

	@Override
	public String toString() {
		return "MotDifficile [idMotDifficile=" + idMotDifficile + ", motDifficile=" + motDifficile + ", langue="
				+ langue + "]";
	}
    
}