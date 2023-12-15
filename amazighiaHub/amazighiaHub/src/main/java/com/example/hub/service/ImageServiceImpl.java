package com.example.hub.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hub.dto.ImageDTO;
import com.example.hub.entity.Image;

import com.example.hub.repository.ImageRepository;


@Service
public class ImageServiceImpl implements ImageService {
	@Autowired
	ModelMapper modelMapper;

    
	  @Autowired
	  private ImageRepository imageRepository;
    
    @Override
	public  Image convertDtoToEntity(ImageDTO  imageDto) {
		// TODO Auto-generated method stub
		
		 Image image = modelMapper.map(imageDto, Image.class);
		
		 return image ;
	}

	 @Override
	public ImageDTO convertEntityToDto(Image image) {
		// TODO Auto-generated method stub
		ImageDTO imageDTO = modelMapper.map(image, ImageDTO.class);
		 return imageDTO; 
	}

	@Override
	public ImageDTO findById(Long id) {
		// TODO Auto-generated method stub
		return convertEntityToDto(imageRepository.getReferenceById(id));
	}

	@Override
	public List<ImageDTO> findAll() {
		// TODO Auto-generated method stub
		return imageRepository.findAll().stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
	}

	@Override
	public ImageDTO save(Image image) {
		// TODO Auto-generated method stub
		return convertEntityToDto( imageRepository.save(image));
	}

	@Override
	public ImageDTO update(Image image) {
		// TODO Auto-generated method stub
		return convertEntityToDto( imageRepository.save(image));
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		imageRepository.deleteById(id);
	}
}
