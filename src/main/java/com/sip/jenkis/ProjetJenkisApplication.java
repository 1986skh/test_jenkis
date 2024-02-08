package com.sip.jenkis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjetJenkisApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetJenkisApplication.class, args);
	     int x = 5;
	        
	       
	        int opposeX = operations.oppose(x);
	        System.out.println("L'opposé de " + x + " est : " + opposeX);
	        
	     
	        int carreX = operations.carre(x);
	        System.out.println("Le carré de " + x + " est : " + carreX);
	}

}
