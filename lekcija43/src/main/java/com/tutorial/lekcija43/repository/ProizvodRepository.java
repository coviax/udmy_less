package com.tutorial.lekcija43.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.lekcija43.model.Proizvod;

@Repository
public interface ProizvodRepository extends JpaRepository<Proizvod, String>  {
	
}
