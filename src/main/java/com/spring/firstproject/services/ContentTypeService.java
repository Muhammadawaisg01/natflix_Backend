package com.spring.firstproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.firstproject.domain_models.Content_Type;

@Service
public class ContentTypeService {
	
	@Autowired
	private ContentTypeRepository repo;
	
	public Content_Type saveContentType(Content_Type content_Type) {
		
	return	repo.save(content_Type);
		
	};

	
	public Content_Type getbyType(String type) {
		return repo.getByType( type);
	}
}
