package com.example.hub.controller;


import com.example.hub.dto.ContenuAuteurDTO;
import com.example.hub.service.ContenuAuteurServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contenu_auteur")
@CrossOrigin
public class ContenuAuteurController {
	 @Autowired
    private  ContenuAuteurServiceImpl contenuAuteurService;

   

    @GetMapping("/all")
    public List<ContenuAuteurDTO> getAllContenus() {
        List<ContenuAuteurDTO> contenus = contenuAuteurService.findAll();
        return contenus;
    }

    @GetMapping("/getById/{id}")
    public ContenuAuteurDTO getContenuById(@PathVariable Long id) {
        ContenuAuteurDTO contenuAuteur = contenuAuteurService.findById(id);
       
            return contenuAuteur;
        
    }

    @PostMapping(value="/save")
    public void createContenu(@RequestBody ContenuAuteurDTO contenu) {
       contenuAuteurService.save(contenu);
       
    }

    @PutMapping("/update/{id}")
    public void updateContenu(@PathVariable Long id, @RequestBody ContenuAuteurDTO contenu) {
      contenuAuteurService.update( contenu);
        
    }

    @DeleteMapping("/delete/{id}")
    public void deleteContenu(@PathVariable Long id) {
       contenuAuteurService.deleteById(id);
    }
}

