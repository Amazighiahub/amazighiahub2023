package com.example.hub.controller;

import com.example.hub.dto.UtilisateurDTO;
import com.example.hub.entity.Utilisateur;
import com.example.hub.service.UtilisateurServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/utilisateurs")
@CrossOrigin
public class UtilisateurController {
	 @Autowired
    private  UtilisateurServiceImpl utilisateurService;

   

    @GetMapping(value="/all")
    public List<UtilisateurDTO> getAllContenus() {
        List<UtilisateurDTO> utilisateur = utilisateurService.findAll();
        return utilisateur ;
    }

    @GetMapping("/getById/{id}")
    public UtilisateurDTO getContenuById(@PathVariable Long id) {
    	UtilisateurDTO utilisateur = utilisateurService.findById(id);
      
            return utilisateur ; 
    }

    @PostMapping(value="/save")
    public void createContenu(@RequestBody Utilisateur utilisateur) {
       utilisateurService.save(utilisateur);
       
    }

    @PutMapping("/update/{id}")
    public void updateContenu(@PathVariable Long id, @RequestBody Utilisateur utilisateur) {
      utilisateurService.update(utilisateur);
        
    }

    @DeleteMapping("/delete/{id}")
    public void deleteContenu(@PathVariable Long id) {
       utilisateurService.deleteById(id);
    }
}


