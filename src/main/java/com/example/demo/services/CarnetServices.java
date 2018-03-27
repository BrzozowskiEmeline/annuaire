package com.example.demo.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.Carnet;
import com.example.demo.repositories.CarnetRepository;

@Service
public class CarnetServices {

	@Autowired
	private CarnetRepository cr;

	public List<Carnet> getAllCarnets() {
		return cr.findAll();

	}
}