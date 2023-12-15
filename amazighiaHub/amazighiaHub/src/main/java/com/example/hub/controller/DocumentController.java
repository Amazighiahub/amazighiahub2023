package com.example.hub.controller;




import com.example.hub.dto.DocumentDTO;
import com.example.hub.entity.Document;
import com.example.hub.service.DocumentServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/documents")
@CrossOrigin
public class DocumentController {
	 @Autowired
    private  DocumentServiceImpl documentService;

   

    @GetMapping("/all")
    public List<DocumentDTO> getAllContenus() {
        List<DocumentDTO> documents = documentService.findAll();
        return  documents;
    }

    @GetMapping("/getById/{id}")
    public DocumentDTO getContenuById(@PathVariable Long id) {
    	DocumentDTO document = documentService.findById(id);
        
            return document;
        
    }

    @PostMapping("/save")
    public void createContenu(@RequestBody Document document) {
       documentService.save(document);
       
    }

    @PutMapping("/update/{id}")
    public void updateContenu(@PathVariable Long id, @RequestBody Document document) {
      documentService.update( document);
        
    }

    @DeleteMapping("/delete/{id}")
    public void deleteContenu(@PathVariable Long id) {
       documentService.deleteById(id);
    }
}


