package com.tutorial.lekcija37.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.lekcija37.model.Korisnik;

public interface KorisnikRepository extends JpaRepository<Korisnik, String> {

}
