package com.example.hub.controller;

import com.example.hub.dto.ReferenceDTO;
import com.example.hub.dto.TraductionContenuDTO;
import com.example.hub.entity.TraductionContenu;
import com.example.hub.service.TraductionContenuServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/traductionContenus")
@CrossOrigin
public class TraductionContenuController {
	 @Autowired
    private  TraductionContenuServiceImpl traductionContenuService;

   

    @GetMapping(value="/all")
    public List<TraductionContenuDTO> getAllContenus() {
        List<TraductionContenuDTO> traduction = traductionContenuService.findAll();
        return traduction;
    }

  

    @PostMapping("/save")
    public void createContenu(@RequestBody TraductionContenu TraductionContenu) {
       traductionContenuService.save(TraductionContenu);
       
    }

    @PutMapping("/update/{id}")
    public void updateContenu(@PathVariable Long id, @RequestBody TraductionContenu traductionContenu) {
      traductionContenuService.update( traductionContenu);
        
    }
    
    @GetMapping("/getById/{id}")
    public TraductionContenuDTO getContenuById(@PathVariable Long id) {
    	TraductionContenuDTO traductionContenuDTO = traductionContenuService.findById(id);
       
            return traductionContenuDTO ;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteContenu(@PathVariable Long id) {
       traductionContenuService.deleteById(id);
    }
}


