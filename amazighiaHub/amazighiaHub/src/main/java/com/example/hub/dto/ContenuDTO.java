package com.example.hub.dto;

import java.time.LocalDate;
import java.util.List;



public class ContenuDTO {

    private Long idContenu;
    private String texteContenu;
    private String titre;
    private LocalDate dateSoumission;
    private TypeContenuDTO typeContenu;
    private UtilisateurDTO utilisateur;
    private LangueDTO langue;
  
    private List<TraductionContenuDTO> traductions;
    private List<ContenuAuteurDTO> auteurs;

	public ContenuDTO() {
    }

    public List<ContenuAuteurDTO> getAuteurs() {
		return auteurs;
	}

	public void setAuteurs(List<ContenuAuteurDTO> auteurs) {
		this.auteurs = auteurs;
	}

	public List<TraductionContenuDTO> getTraductions() {
		return traductions;
	}

	public void setTraductions(List<TraductionContenuDTO> traductions) {
		this.traductions = traductions;
	}

	public ContenuDTO(Long idContenu, String texteContenu, String titre, LocalDate dateSoumission,
                     TypeContenuDTO typeContenu, UtilisateurDTO utilisateur, LangueDTO langue) {
        this.idContenu = idContenu;
        this.texteContenu = texteContenu;
        this.titre = titre;
        this.dateSoumission = dateSoumission;
        this.typeContenu = typeContenu;
        this.utilisateur = utilisateur;
        this.langue = langue;
    }

    // Getters et setters

    public Long getIdContenu() {
        return idContenu;
    }

    public void setIdContenu(Long idContenu) {
        this.idContenu = idContenu;
    }

    public String getTexteContenu() {
        return texteContenu;
    }

    public void setTexteContenu(String texteContenu) {
        this.texteContenu = texteContenu;
    }

    public String getResume() {
        return titre;
    }

    public void setResume(String titre) {
        this.titre = titre;
    }

    public LocalDate getDateSoumission() {
        return dateSoumission;
    }

    public void setDateSoumission(LocalDate dateSoumission) {
        this.dateSoumission = dateSoumission;
    }

    public TypeContenuDTO getTypeContenu() {
        return typeContenu;
    }

    public void setTypeContenu(TypeContenuDTO typeContenu) {
        this.typeContenu = typeContenu;
    }

    public UtilisateurDTO getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(UtilisateurDTO utilisateur) {
        this.utilisateur = utilisateur;
    }

    public LangueDTO getLangue() {
        return langue;
    }

    public void setLangue(LangueDTO langue) {
        this.langue = langue;
    }

    @Override
    public String toString() {
        return "ContenuDTO [idContenu=" + idContenu + ", texteContenu=" + texteContenu + ", titre=" + titre
                + ", dateSoumission=" + dateSoumission + ", typeContenu=" + typeContenu + ", utilisateur=" + utilisateur
                + ", langue=" + langue + "]";
    }
}
