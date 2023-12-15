package com.example.hub.controller;

import com.example.hub.dto.TypeContenuDTO;

import com.example.hub.service.TypeContenuServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/typeContenus")
@CrossOrigin
public class TypeContenuController {
	 @Autowired
    private  TypeContenuServiceImpl typeContenuService;

   

    @GetMapping("/all")
    public List<TypeContenuDTO> getAllContenus() {
        List<TypeContenuDTO> traductionE = typeContenuService.findAll();
        return traductionE;
    }

    @GetMapping("/getById/{id}")
    public TypeContenuDTO getContenuById(@PathVariable Long id) {
    	TypeContenuDTO typeContenu = typeContenuService.findById(id);
        
            return typeContenu ;
    }

    @PostMapping("/save")
    public void createContenu(@RequestBody TypeContenuDTO typeContenu) {
       typeContenuService.save(typeContenu);
       
    }

    @PutMapping("/update/{id}")
    public void updateContenu(@PathVariable Long id, @RequestBody TypeContenuDTO typeContenu) {
      typeContenuService.update( typeContenu);
        
    }

    @DeleteMapping("/delete/{id}")
    public void deleteContenu(@PathVariable Long id) {
       typeContenuService.deleteById(id);
    }
}


