package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Carnet;
import com.example.demo.repositories.CarnetRepository;

@Service
public class CarnetServices {

	@Autowired
	private CarnetRepository cr; 
	
	
	//affichage
	public List<Carnet> getAllCarnets() {
		return cr.findAll();
	}
	
	//ajout ds le carnet
	public void add(Carnet carnet) {
		cr.save(carnet);
	}
	
	
	//taille de la table
	public Long count() {
		return cr.count();
	}
	
	//ajoute tout 
	public void setAllCarnets(List<Carnet> carnet)
	{
		cr.saveAll(carnet);
	}
	

	// renvoie 1 element
	public Carnet getCarnets(Long id) {
		return cr.getOne(id);
	}
	
	
	//supprimer tout
//	public void DeleteAll() {
//		cr.deleteAll();
//	}
	
	
	// supprime 1 id
	public void delete(Long id) {
		cr.deleteById(id);
	}
	
	public Carnet findById(Long id) {
		return cr.findById(id).get();
	}

	

	
}