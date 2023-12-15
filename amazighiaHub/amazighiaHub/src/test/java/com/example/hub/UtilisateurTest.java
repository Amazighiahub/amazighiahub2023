package com.example.hub;



import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.hub.entity.Utilisateur;

import com.example.hub.service.UtilisateurServiceImpl;
@SpringBootTest
class UtilisateurTest {
	 @Autowired
		private UtilisateurServiceImpl  utilisateurService;

	@Test
	void test() {
		Utilisateur utilisateur = new Utilisateur();
		
		 utilisateur.setNomUtilisateur("Sebaa");
		 utilisateur.setPrenom("Rabeh ");
		
		 utilisateurService.save(utilisateur);
	}

}
