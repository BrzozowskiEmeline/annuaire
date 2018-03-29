package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entities.Compte;
import com.example.demo.services.CompteServices;

@RestController
public class CompteController {
	
	
	
	@Autowired
	private CompteServices cos;
	
	
	@RequestMapping("/compteadd")
	public void ajout() {
		cos.add(new Compte(4L, "Chef", 060L));
		cos.add(new Compte(5L, "Rpublique",0646L));
		cos.add(new Compte(6L, "place",016L));
	}
	
	@GetMapping("/compte")
	public  List<Compte> affiche1() {
		return cos.affiche1();
	}
}
