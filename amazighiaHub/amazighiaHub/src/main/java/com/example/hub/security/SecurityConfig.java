package com.example.hub.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.servlet.util.matcher.MvcRequestMatcher;

import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.handler.HandlerMappingIntrospector;

import java.util.Arrays;
import java.util.Collections;


@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Autowired
 	UserDetailsService userDetailsService;
 	
 	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;
 	
 	@Autowired
 	AuthenticationManager authMgr;
	
	
 	 @Bean
     public AuthenticationManager authenticationManagerBean(HttpSecurity http) throws Exception {
         AuthenticationManagerBuilder authenticationManagerBuilder = http.getSharedObject(AuthenticationManagerBuilder.class);
         authenticationManagerBuilder.userDetailsService(userDetailsService).passwordEncoder(getBCE());
         return authenticationManagerBuilder.build();
     }
 	
 	@Bean
	BCryptPasswordEncoder getBCE() {
		return new BCryptPasswordEncoder();
	}
 	@Bean
 	MvcRequestMatcher.Builder mvc(HandlerMappingIntrospector introspector) {
 		return new MvcRequestMatcher.Builder(introspector).servletPath("/tamazight");
 	}
    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration config = new CorsConfiguration();
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        config.setAllowedOrigins(Collections.singletonList("http://localhost:4200"));
        config.setAllowedMethods(Collections.singletonList("*"));
        config.setAllowCredentials(true);
        config.setAllowedHeaders(Collections.singletonList("*"));
        config.setExposedHeaders(Arrays.asList("Authorization"));
        config.setMaxAge(3600L);
        source.registerCorsConfiguration("/**", config);
        return source;
    }
 	
 	 @Bean
     public SecurityFilterChain filterChain( HttpSecurity http,  MvcRequestMatcher.Builder mvc) throws Exception { 
 		
 		http.csrf(csrf -> csrf.disable());
        http.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
        .authorizeHttpRequests(req ->  req.requestMatchers(mvc.pattern("/tamazight/api/contenus/**")).hasAnyAuthority("ADMIN")
        		.requestMatchers(mvc.pattern("/tamazight/api/contenus/getBy/**"),mvc.pattern("/tamazight/api/contenus/all")).hasRole("USER")
                .anyRequest().authenticated()
               
                );
        http.cors(cors -> cors.configurationSource(corsConfigurationSource()));
       
       
        http.addFilterBefore(new JWTAuthenticationFilter (authMgr),UsernamePasswordAuthenticationFilter.class)
        .addFilterBefore(new JWTAuthorizationFilter(),UsernamePasswordAuthenticationFilter.class);


		 return http.build();
	}
}