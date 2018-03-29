package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Adress;
import com.example.demo.repositories.AdressRepository;

@Service
public class AdressServices {
	
	@Autowired
	AdressRepository ar;
	
	//ajout des contacts
	public void add(Adress adress) {
		ar.save(adress);
	}
	
	//affichage 
	public  List<Adress> affiche() {
		return ar.findAll();
	}

}
