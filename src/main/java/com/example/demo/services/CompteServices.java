package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Entities.Compte;
import com.example.demo.repositories.CompteRepository;

@Service
public class CompteServices {
	
	@Autowired
	CompteRepository cor;
	
	//ajout des comptes
		public void add(Compte compte) {
			cor.save(compte);
		}

		//affichage 
		public  List<Compte> affiche1() {
			return cor.findAll();
		}
}
