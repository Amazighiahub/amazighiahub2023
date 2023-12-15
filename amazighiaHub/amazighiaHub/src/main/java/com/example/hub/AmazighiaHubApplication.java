package com.example.hub;



import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.hub.entity.Role;
import com.example.hub.entity.Utilisateur;
import com.example.hub.service.UtilisateurService;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class AmazighiaHubApplication {
	@Autowired
	UtilisateurService userService ;
	

	public static void main(String[] args) {
		SpringApplication.run(AmazighiaHubApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper()
	{
		return new ModelMapper();
	}
	
	
	/*@PostConstruct
	void init_users() {
		//ajouter les rôles
		//userService.addRole(new Role("ROLE_USER"));
		//userService.addRole(new Role("ROLE_ADMIN"));
		//userService.addRole(new Role("ROLE_SPE"));
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPassword = encoder.encode("1234");
		//ajouter les users
		 Utilisateur user = new Utilisateur("Guerfi","Souhila", "livres.projet@gmail.com",encodedPassword  );
		userService.save(user);
	
		userService.addRoleToUser("livres@gmail.com", "ROLE_USER");
				
	}  */
  
	

}
