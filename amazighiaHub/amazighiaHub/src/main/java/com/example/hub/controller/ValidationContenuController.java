package com.example.hub.controller;

import com.example.hub.dto.ValidationContenuDTO;
import com.example.hub.entity.ValidationContenu;
import com.example.hub.service.ValidationContenuServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/validationContenus")
@CrossOrigin
public class ValidationContenuController {
	 @Autowired
    private  ValidationContenuServiceImpl validationContenuService;

   

    @GetMapping("/all")
    public List<ValidationContenuDTO> getAllContenus() {
        List<ValidationContenuDTO> validationContenus = validationContenuService.findAll();
        return validationContenus;
    }

    @GetMapping("getById/{id}")
    public ValidationContenuDTO getContenuById(@PathVariable Long id) {
    	ValidationContenuDTO validationContenu = validationContenuService.findById(id);
       
            return validationContenu ;
    }

    @PostMapping("/save")
    public void createContenu(@RequestBody ValidationContenu validationContenu) {
       validationContenuService.save(validationContenu);
       
    }

    @PutMapping("/update/{id}")
    public void updateContenu(@PathVariable Long id, @RequestBody ValidationContenu validationContenu) {
      validationContenuService.update(validationContenu);
        
    }

    @DeleteMapping("/delete/{id}")
    public void deleteContenu(@PathVariable Long id) {
       validationContenuService.deleteById(id);
    }
}


