package com.example.hub;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.hub.entity.Langue;
import com.example.hub.repository.LangueRepository;
import com.example.hub.service.LangueServiceImpl;
@SpringBootTest
class LangueTests {
	
	@Autowired
	LangueRepository  langueRepository ;

	@Test
	void addLangue() {
		Langue langue = new Langue("tcawit") ;
		Langue langue1 = new Langue("Derja") ;
		Langue langue2 = new Langue("Arabe") ;
		Langue langue3 = new Langue("Francais") ; //Taqbaylit
		Langue langue4 = new Langue("Taqbaylit") ;
		Langue langue5 = new Langue("Anglais") ;
		Langue langue6 = new Langue("Tmzabit") ;
		Langue langue7 = new Langue("Tcnouit") ; //Tamašeq 
		Langue langue8 = new Langue("Tamašeq") ; //Tamahaq 
		Langue langue9 = new Langue("Tamahaq") ;
		Langue langue10 = new Langue("Zenata") ;//Zenata
		
		List<Langue> langues = List.of(langue, langue1,langue2,langue3,langue4,langue5,langue6,langue7,langue8,langue9,langue10);
		
		langueRepository.saveAll(langues);
	}

}
