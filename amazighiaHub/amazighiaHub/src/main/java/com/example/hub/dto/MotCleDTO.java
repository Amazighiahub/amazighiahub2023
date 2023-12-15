package com.example.hub.dto;



public class MotCleDTO {
	private Long idMotCle;
   
    private String motCle;

	public MotCleDTO(Long idMotCle, String motCle) {
		super();
		this.idMotCle = idMotCle;
		this.motCle = motCle;
	}
    
    public MotCleDTO() {}

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
		return "MotCleDTO [idMotCle=" + idMotCle + ", motCle=" + motCle + "]";
	}
    
    

}
