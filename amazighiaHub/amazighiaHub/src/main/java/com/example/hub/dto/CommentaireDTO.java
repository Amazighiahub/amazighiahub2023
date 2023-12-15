package com.example.hub.dto;

import java.time.LocalDate;

public class CommentaireDTO {

    private Long idCommentaire;
    private ContenuDTO contenu;
    private UtilisateurDTO utilisateur;
    private String texteCommentaire;
    private LocalDate dateCommentaire;

    public CommentaireDTO() {
    }

    public CommentaireDTO(Long idCommentaire, ContenuDTO contenu, UtilisateurDTO utilisateur, String texteCommentaire, LocalDate dateCommentaire) {
        this.idCommentaire = idCommentaire;
        this.contenu = contenu;
        this.utilisateur = utilisateur;
        this.texteCommentaire = texteCommentaire;
        this.dateCommentaire = dateCommentaire;
    }

    // Getters et setters

    public Long getIdCommentaire() {
        return idCommentaire;
    }

    public void setIdCommentaire(Long idCommentaire) {
        this.idCommentaire = idCommentaire;
    }

    public ContenuDTO getContenu() {
        return contenu;
    }

    public void setContenu(ContenuDTO contenu) {
        this.contenu = contenu;
    }

    public UtilisateurDTO getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(UtilisateurDTO utilisateur) {
        this.utilisateur = utilisateur;
    }

    public String getTexteCommentaire() {
        return texteCommentaire;
    }

    public void setTexteCommentaire(String texteCommentaire) {
        this.texteCommentaire = texteCommentaire;
    }

    public LocalDate getDateCommentaire() {
        return dateCommentaire;
    }

    public void setDateCommentaire(LocalDate dateCommentaire) {
        this.dateCommentaire = dateCommentaire;
    }

    @Override
    public String toString() {
        return "CommentaireDTO [idCommentaire=" + idCommentaire + ", contenu=" + contenu + ", utilisateur=" + utilisateur
                + ", texteCommentaire=" + texteCommentaire + ", dateCommentaire=" + dateCommentaire + "]";
    }
}

