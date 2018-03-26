package com.example.demo.carnet;

public enum Civilite {

	
	M("MONSIEUR"),MME("MADAME");
	
	private String nom;
	private Civilite(String nom) {
	this.nom = nom;
	}
	public String getNom() {
	return nom;
	}
	public void setNom(String nom) {
	this.nom = nom;
	}
}
