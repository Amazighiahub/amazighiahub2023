package com.example.hub.controller;

import com.example.hub.dto.ContenuDTO;

import com.example.hub.service.ContenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/contenus")
@CrossOrigin
public class ContenuController {
	 @Autowired
    private  ContenuServiceImpl contenuService;

   

    @GetMapping("/all")
    public List<ContenuDTO> getAllContenus() {
        List<ContenuDTO> contenus = contenuService.findAll();
        return contenus;
    }
    
    @GetMapping("/getBy/{type}")
    public List<ContenuDTO> getAllContenusByType(@PathVariable String type) {
        return contenuService.findAll().stream()
                .filter(contenu -> contenu.getTypeContenu().getLibelleType().equalsIgnoreCase(type))
                .collect(Collectors.toList());
    }

    @GetMapping("/getById/{id}")
    public ContenuDTO getContenuById(@PathVariable Long id) {
        ContenuDTO contenu = contenuService.findById(id);
        return contenu;
    }

    @GetMapping("/getByUSER/{id}")
    public List<ContenuDTO> getContenuByUser(@PathVariable Long id) {
        List<ContenuDTO> contenu = contenuService.findByUser(id);
        return contenu;
    }
    @PostMapping("/save")
    public void createContenu(@RequestBody ContenuDTO contenu) {
       contenuService.save(contenu);
       
    }

    @PutMapping("/update/{id}")
    public void updateContenu(@PathVariable Long id, @RequestBody ContenuDTO contenu) {
      contenuService.update( contenu);
        
    }

    @DeleteMapping("/delete/{id}")
    public void deleteContenu(@PathVariable Long id) {
       contenuService.deleteById(id);
    }
}
