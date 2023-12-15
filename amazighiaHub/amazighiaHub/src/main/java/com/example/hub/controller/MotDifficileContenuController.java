package com.example.hub.controller;

import com.example.hub.dto.MotDifficileContenuDTO;
import com.example.hub.entity.MotDifficileContenu;
import com.example.hub.service.MotDifficileContenuServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/motDifficileContenu")

public class MotDifficileContenuController {
	@Autowired
    private  MotDifficileContenuServiceImpl motDifficileContenuService;

   

    @GetMapping(value="/all")
    public List<MotDifficileContenuDTO> getAllContenus() {
        List<MotDifficileContenuDTO> motDcontenus = motDifficileContenuService.findAll();
        return motDcontenus ;
    }

    @GetMapping("/getById/{id}")
    public MotDifficileContenuDTO getContenuById(@PathVariable Long id) {
    	MotDifficileContenuDTO motDifficileContenu = motDifficileContenuService.findById(id);
        
            return motDifficileContenu ;
       
    }

    @PostMapping(value="/save")
    public void createContenu(@RequestBody MotDifficileContenu motDifficileContenu) {
       motDifficileContenuService.save(motDifficileContenu);
       
    }

    @PutMapping("/update/{id}")
    public void updateContenu(@PathVariable Long id, @RequestBody MotDifficileContenu motDifficileContenu) {
      motDifficileContenuService.update( motDifficileContenu);
        
    }

    @DeleteMapping("/delete/{id}")
    public void deleteContenu(@PathVariable Long id) {
       motDifficileContenuService.deleteById(id);
    }
}



