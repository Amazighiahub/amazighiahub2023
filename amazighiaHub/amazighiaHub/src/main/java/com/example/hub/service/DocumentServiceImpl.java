package com.example.hub.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hub.dto.DocumentDTO;
import com.example.hub.entity.Document;

import com.example.hub.repository.DocumentRepository;


@Service
public class DocumentServiceImpl implements DocumentService{


	@Autowired
	ModelMapper modelMapper;

    
	  @Autowired
	  private DocumentRepository documentRepository;
    

	  
	  
	

    @Override
	public  Document convertDtoToEntity(DocumentDTO  documentDto) {
		// TODO Auto-generated method stub
		
		 Document document = modelMapper.map(documentDto, Document.class);
		
		 return document ;
	}

	 @Override
	public DocumentDTO convertEntityToDto(Document document) {
		// TODO Auto-generated method stub
		DocumentDTO documentDTO = modelMapper.map(document, DocumentDTO.class);
		 return documentDTO; 
	}

	@Override
	public DocumentDTO findById(Long id) {
		// TODO Auto-generated method stub
		return convertEntityToDto(documentRepository.getReferenceById(id));
	}

	@Override
	public List<DocumentDTO> findAll() {
		// TODO Auto-generated method stub
		return documentRepository.findAll().stream()
				.map(this::convertEntityToDto)
				.collect(Collectors.toList());
	}

	@Override
	public DocumentDTO save(Document Document) {
		// TODO Auto-generated method stub
		return convertEntityToDto( documentRepository.save(Document));
	}

	@Override
	public DocumentDTO update(Document document) {
		// TODO Auto-generated method stub
		return convertEntityToDto( documentRepository.save(document));
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		documentRepository.deleteById(id);
	}
}
