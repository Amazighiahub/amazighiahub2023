package com.example.hub.controller;
import com.example.hub.dto.MotDifficileDTO;
import com.example.hub.entity.MotDifficile;
import com.example.hub.service.MotDifficileServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/motDifficile")
@CrossOrigin
public class MotDifficileController {
	 @Autowired
    private  MotDifficileServiceImpl motDifficileService;

   

    @GetMapping(value="/all")
    public List<MotDifficileDTO> getAllContenus() {
        List<MotDifficileDTO> contenus = motDifficileService.findAll();
        return contenus;
    }

    @GetMapping("/getById/{id}")
    public MotDifficileDTO getContenuById(@PathVariable Long id) {
    	MotDifficileDTO motDifficile = motDifficileService.findById(id);
      
            return  motDifficile;
      
    }

    @PostMapping(value="/save")
    public void createContenu(@RequestBody MotDifficile motDifficile) {
       motDifficileService.save(motDifficile);
       
    }

    @PutMapping("/update/{id}")
    public void updateContenu(@PathVariable Long id, @RequestBody MotDifficile motDifficile) {
      motDifficileService.update( motDifficile);
        
    }

    @DeleteMapping("/delete/{id}")
    public void deleteContenu(@PathVariable Long id) {
       motDifficileService.deleteById(id);
    }
}



