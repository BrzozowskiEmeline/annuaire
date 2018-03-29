package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Entities.Adress;
import com.example.demo.services.AdressServices;

@RestController
public class AdressControllers {

	
	@Autowired
	private AdressServices as;
	
	
	@RequestMapping("/adressadd")
	public void ajout() {
		as.add(new Adress(1L, 61, "Mons", 59800, "Tokyo"));
		as.add(new Adress(2L, 153,"laRpublique", 69500, "Lyon"));
		as.add(new Adress(3L,455,"LaPlace", 92500, "Paris"));

	}
	@GetMapping("/adress")
	public  List<Adress> affiche() {
		return as.affiche();
	}
	
	
	

	
	
	
	
}
