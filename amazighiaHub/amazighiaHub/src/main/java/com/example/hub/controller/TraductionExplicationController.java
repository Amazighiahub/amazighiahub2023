package com.example.hub.controller;

import com.example.hub.dto.TraductionExplicationDTO;
import com.example.hub.entity.TraductionExplication;
import com.example.hub.service.TraductionExplicationServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/traductionExplications")
@CrossOrigin
public class TraductionExplicationController {
	 @Autowired
    private  TraductionExplicationServiceImpl traductionExplicationService;

   

    @GetMapping(value="/all")
    public List<TraductionExplicationDTO> getAllContenus() {
        List<TraductionExplicationDTO> traductionE = traductionExplicationService.findAll();
        return traductionE ;
    }

    @GetMapping("/getById/{id}")
    public TraductionExplicationDTO getContenuById(@PathVariable Long id) {
    	TraductionExplicationDTO traductionExplication = traductionExplicationService.findById(id);
      
            return traductionExplication;
       
    }

    @PostMapping("/save")
    public void createContenu(@RequestBody TraductionExplication traductionExplication) {
       traductionExplicationService.save(traductionExplication);
       
    }

    @PutMapping("/update/{id}")
    public void updateContenu(@PathVariable Long id, @RequestBody TraductionExplication traductionExplication) {
      traductionExplicationService.update(traductionExplication);
        
    }

    @DeleteMapping("/delete/{id}")
    public void deleteContenu(@PathVariable Long id) {
       traductionExplicationService.deleteById(id);
    }
}


