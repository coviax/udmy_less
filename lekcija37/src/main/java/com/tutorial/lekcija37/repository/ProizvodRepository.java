package com.tutorial.lekcija37.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.lekcija37.model.Proizvod;

public interface ProizvodRepository extends JpaRepository<Proizvod, String> {

}
