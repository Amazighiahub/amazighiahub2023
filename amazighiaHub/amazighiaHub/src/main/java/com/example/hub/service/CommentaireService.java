package com.example.hub.service;

import java.util.List;

import com.example.hub.dto.CommentaireDTO;
import com.example.hub.entity.Commentaire;




public interface CommentaireService {
    CommentaireDTO findById(Long id);
    List<CommentaireDTO> findAll();
    CommentaireDTO save(CommentaireDTO commentaire);
    CommentaireDTO update(CommentaireDTO entity);
    void deleteById(Long id);
    Commentaire convertDtoToEntity(CommentaireDTO  commentaireDto);
    CommentaireDTO convertEntityToDto(Commentaire commentaire) ;
}
