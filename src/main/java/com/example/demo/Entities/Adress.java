package com.example.demo.Entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="carnet")
public class Adress {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(length=6)
	private Integer number;
	
	private String street;
	
	@Column(length=5)
	private Integer postcode;
	
	private String town;
	

	@ManyToMany(mappedBy="adress")
	private List<Carnet> carnets;
	
	
	
	
	
	
	
	public Adress() {
		carnets = new ArrayList<>();
	}

	public Adress(Long id, Integer number, String street, Integer postcode, String town) {
		carnets = new ArrayList<>();
		this.id = id;
		this.number = number;
		this.street = street;
		this.postcode = postcode;
		this.town = town;
		//this.carnets = carnets;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public Integer getPostcode() {
		return postcode;
	}

	public void setPostcode(Integer postcode) {
		this.postcode = postcode;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public List<Carnet> getCarnets() {
		return carnets;
	}

	public void setCarnets(List<Carnet> carnets) {
		this.carnets = carnets;
	}
	
	
	
	
	
	
	
}
