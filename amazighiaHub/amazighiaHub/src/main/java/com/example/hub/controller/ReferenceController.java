package com.example.hub.controller;

import com.example.hub.dto.ReferenceDTO;
import com.example.hub.entity.Reference;
import com.example.hub.service.ReferenceServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/references")
@CrossOrigin
public class ReferenceController {
	 @Autowired
    private  ReferenceServiceImpl referenceService;

   

    @GetMapping(value="/all")
    public List<ReferenceDTO> getAllContenus() {
        List<ReferenceDTO> references = referenceService.findAll();
        return references;
    }

    @GetMapping("/getById/{id}")
    public ReferenceDTO getContenuById(@PathVariable Long id) {
    	ReferenceDTO reference = referenceService.findById(id);
       
            return reference ;
    }

    @PostMapping(value="/save")
    public void createContenu(@RequestBody Reference Reference) {
       referenceService.save(Reference);
       
    }

    @PutMapping("/update/{id}")
    public void updateContenu(@PathVariable Long id, @RequestBody Reference Reference) {
      referenceService.update( Reference);
        
    }

    @DeleteMapping("/delete/{id}")
    public void deleteContenu(@PathVariable Long id) {
       referenceService.deleteById(id);
    }
}


