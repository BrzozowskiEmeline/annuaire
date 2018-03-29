package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entities.Adress;

@Repository
public interface AdressRepository extends JpaRepository<Adress, Long>{
	

}
