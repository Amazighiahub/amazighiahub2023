package com.example.hub.service;

import java.util.List;

import com.example.hub.dto.DocumentDTO;
import com.example.hub.entity.Document;

public interface DocumentService {
	 DocumentDTO findById(Long id);
	    List<DocumentDTO> findAll();
	    DocumentDTO save(Document Document);
	    DocumentDTO update(Document entity);
	    void deleteById(Long id);
	    Document convertDtoToEntity(DocumentDTO  DocumentDto);
	    DocumentDTO convertEntityToDto(Document Document) ;
}
