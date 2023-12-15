package com.example.hub.service;

import java.util.List;

import com.example.hub.dto.ImageDTO;
import com.example.hub.entity.Image;

public interface ImageService {
	ImageDTO findById(Long id);
    List<ImageDTO> findAll();
    ImageDTO save(Image Image);
    ImageDTO update(Image entity);
    void deleteById(Long id);
    Image convertDtoToEntity(ImageDTO  ImageDto);
    ImageDTO convertEntityToDto(Image Image) ;
}

