package com.example.hub.controller;



import com.example.hub.dto.CommentaireDTO;

import com.example.hub.service.CommentaireServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/commentaires")
@CrossOrigin // You can replace this URL with the frontend application URL
public class CommentaireController {
	 @Autowired
    private  CommentaireServiceImpl commentaireService;

   
    @GetMapping(value="/all")
    public List<CommentaireDTO> getAllCommentaires() {
        return commentaireService.findAll();
    }

    @GetMapping("/getBy/{id}")
    public CommentaireDTO getCommentaireById(@PathVariable Long id) {
        return commentaireService.findById(id);
    }

    @PostMapping("/save/{id}")
    public void  createCommentaire(@RequestBody CommentaireDTO commentaire) {
         commentaireService.save(commentaire);
    }

    @PutMapping("/update/{id}")
    public void updateCommentaire(@PathVariable Long id, @RequestBody CommentaireDTO commentaire) {
         commentaireService.update( commentaire);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCommentaire(@PathVariable Long id) {
        commentaireService.deleteById(id);
    }
}

