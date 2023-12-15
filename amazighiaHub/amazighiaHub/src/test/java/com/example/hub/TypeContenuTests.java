package com.example.hub;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.hub.entity.TypeContenu;

import com.example.hub.service.TypeContenuServiceImpl;

@SpringBootTest
class  TypeContenuTests {
	
  @Autowired
	private TypeContenuServiceImpl  typeConetnuService;

	@Test
	void addTypeContenu() {
		/* TypeContenu type = new TypeContenu("Citation");
		 typeConetnuService.save(type);
		 TypeContenu type1 = new TypeContenu("Proverbe");
		 typeConetnuService.save(type1);
		 TypeContenu type2 = new TypeContenu("Article");
		 typeConetnuService.save(type2);
		 TypeContenu type3 = new TypeContenu("Livre");
		 typeConetnuService.save(type3);*/
	}
	

}
