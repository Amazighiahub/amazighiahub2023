package com.example.hub.dto;

import java.util.List;

public class TypeContenuDTO {
    private Long idTypeContenu;
    private String libelleType;
    private List<ContenuDTO> contenuDTOList;
    public TypeContenuDTO() {
        // initialisation si nécessaire
    }
    public TypeContenuDTO(Long idTypeContenu, String libelleType, List<ContenuDTO> contenuDTOList) {
        this.idTypeContenu = idTypeContenu;
        this.libelleType = libelleType;
        this.contenuDTOList = contenuDTOList;
    }

	public Long getIdTypeContenu() {
		return idTypeContenu;
	}

	public void setIdTypeContenu(Long idTypeContenu) {
		this.idTypeContenu = idTypeContenu;
	}

	public String getLibelleType() {
		return libelleType;
	}

	public void setLibelleType(String libelleType) {
		this.libelleType = libelleType;
	}

	public List<ContenuDTO> getContenuDTOList() {
		return contenuDTOList;
	}

	public void setContenuDTOList(List<ContenuDTO> contenuDTOList) {
		this.contenuDTOList = contenuDTOList;
	}

	@Override
	public String toString() {
		return "TypeContenuDTO [idTypeContenu=" + idTypeContenu + ", libelleType=" + libelleType + ", contenuDTOList="
				+ contenuDTOList + "]";
	}

    // Getters et setters
    
    
    
}