package com.example.hub.controller;

import com.example.hub.dto.MotCleDTO;
import com.example.hub.service.MotCleServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/motCle")
@CrossOrigin
public class MotCleController {
	 @Autowired
    private  MotCleServiceImpl motCleService;

   

    @GetMapping("/all")
    public List<MotCleDTO> getAllContenus() {
        List<MotCleDTO> contenus = motCleService.findAll();
        return contenus ;
    }

    @GetMapping("/getById/{id}")
    public MotCleDTO getContenuById(@PathVariable Long id) {
    	MotCleDTO motCle = motCleService.findById(id);
       
            return motCle ;
        
        
    }

    @PostMapping("/save")
    public void createContenu(@RequestBody MotCleDTO motCle) {
       motCleService.save(motCle);
       
    }

    @PutMapping("/update/{id}")
    public void updateContenu(@PathVariable Long id, @RequestBody MotCleDTO motCle) {
      motCleService.update(motCle);
        
    }

    @DeleteMapping("/delete/{id}")
    public void deleteContenu(@PathVariable Long id) {
       motCleService.deleteById(id);
    }
}



