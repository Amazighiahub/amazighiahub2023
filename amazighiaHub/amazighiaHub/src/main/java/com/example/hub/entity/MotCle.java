package com.example.hub.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "Mots-Clés")
public class MotCle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMotCle;
    @Column(nullable = false, length = 40)
    private String motCle;

    // Getters and setters
    
    public MotCle() {}

	public MotCle(Long idMotCle, String motCle) {
		super();
		this.idMotCle = idMotCle;
		this.motCle = motCle;
	}

	public Long getIdMotCle() {
		return idMotCle;
	}

	public void setIdMotCle(Long idMotCle) {
		this.idMotCle = idMotCle;
	}

	public String getMotCle() {
		return motCle;
	}

	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}

	@Override
	public String toString() {
		return "MotCle [idMotCle=" + idMotCle + ", motCle=" + motCle + "]";
	}
    
}