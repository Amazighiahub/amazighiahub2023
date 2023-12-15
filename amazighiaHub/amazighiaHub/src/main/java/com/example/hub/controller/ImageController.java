package com.example.hub.controller;

import com.example.hub.dto.ImageDTO;
import com.example.hub.entity.Image;
import com.example.hub.service.ImageServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/images")
@CrossOrigin(origins = "http://localhost:3000")
public class ImageController {
	 @Autowired
    private  ImageServiceImpl imageService;

   

    @GetMapping("/all")
    public List<ImageDTO> getAllContenus() {
        List<ImageDTO> images = imageService.findAll();
        return images;
    }

    @GetMapping("/getById/{id}")
    public ImageDTO getContenuById(@PathVariable Long id) {
    	ImageDTO image = imageService.findById(id);
        
            return image ;
    }

    @PostMapping("/save")
    public void createContenu(@RequestBody Image Image) {
       imageService.save(Image);
       
    }

    @PutMapping("/update/{id}")
    public void updateContenu(@PathVariable Long id, @RequestBody Image image) {
      imageService.update( image);
        
    }

    @DeleteMapping("/delete/{id}")
    public void deleteContenu(@PathVariable Long id) {
       imageService.deleteById(id);
    }
}


