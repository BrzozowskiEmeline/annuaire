package com.example.demo.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity

public class Compte {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(length=50)
	 private String nom;
	
	@Column(length =10)
	 private Long numero;
	
	
	
	
	
	
	@ManyToOne
	 public Carnet carnet;
	
	
	
	
	
	
	
	 public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}



	public Carnet getCarnet() {
		return carnet;
	}

	public void setCarnet(Carnet carnet) {
		this.carnet = carnet;
	}

	public Compte(Long id, String nom, Long numero) {
		
		this.id = id;
		this.nom = nom;
		this.numero = numero;
	}
	
	

public Compte() {
		

	}




	 

}
