package com.example.hub.controller;

import com.example.hub.dto.LangueDTO;
import com.example.hub.service.LangueServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/langues")
@CrossOrigin(origins = "http://localhost:4200")
public class LangueController {
	 @Autowired
    private  LangueServiceImpl langueService;

   

    @GetMapping("/all")
    public List<LangueDTO> getAllContenus() {
        List<LangueDTO> langues = langueService.findAll();
        return langues;
    }

    @GetMapping("/getById/{id}")
    public LangueDTO getContenuById(@PathVariable Long id) {
    	LangueDTO langue = langueService.findById(id);
       
            return langue;
     
    }

    @PostMapping("/save")
    public void createContenu(@RequestBody LangueDTO langue) {
       langueService.save(langue);
       
    }

    @PutMapping("/update/{id}")
    public void updateContenu(@PathVariable Long id, @RequestBody LangueDTO langue) {
      langueService.update( langue);
        
    }

    @DeleteMapping("/delete/{id}")
    public void deleteContenu(@PathVariable Long id) {
       langueService.deleteById(id);
    }
}


