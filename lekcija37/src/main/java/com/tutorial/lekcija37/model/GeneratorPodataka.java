package com.tutorial.lekcija37.model;


import com.tutorial.lekcija37.repository.KorisnikRepository;
import com.tutorial.lekcija37.repository.ProizvodRepository;



public class GeneratorPodataka {

	public void postaviPodatke(KorisnikRepository kRepo, ProizvodRepository pRepo) {
		
		
		// Generiranje proizvoda 
		Proizvod proizvod1 = new Proizvod();
		proizvod1.setNaziv("Test Proizvod 1");
		proizvod1.setOpis("Opis proizvoda 1");
		proizvod1.setKategorija("TEST");
		proizvod1.setTip("GENERAL");
		proizvod1.setKid(1);
		
		Proizvod proizvod2 = new Proizvod();
		proizvod2.setNaziv("Test Proizvod 2");
		proizvod2.setOpis("Opis proizvoda 2");
		proizvod2.setKategorija("TEST");
		proizvod2.setTip("GENERAL");
		proizvod2.setKid(1);
		
		Proizvod proizvod3 = new Proizvod();
		proizvod3.setNaziv("Test Proizvod 3");
		proizvod3.setOpis("Opis proizvoda 3");
		proizvod3.setKategorija("TEST");
		proizvod3.setTip("SPECIAL");
		proizvod3.setKid(2);
		
		Proizvod proizvod4 = new Proizvod();
		proizvod4.setNaziv("Test Proizvod 4");
		proizvod4.setOpis("Opis proizvoda 4");
		proizvod4.setKategorija("TEST");
		proizvod4.setTip("CUSTOM");
		proizvod4.setKid(1);

		//Upis proizvoda u bazu
		pRepo.save(proizvod1);
		pRepo.save(proizvod2);
		pRepo.save(proizvod3);
		pRepo.save(proizvod4);
		
		// Generiranje korisnika
		Korisnik korisnik1 = new Korisnik();
		korisnik1.setKorisnickoIme("pero");
		korisnik1.setLozinka("pero123");
		
		Korisnik korisnik2 = new Korisnik();
		korisnik2.setKorisnickoIme("jura");
		korisnik2.setLozinka("jura123");
		
		Korisnik korisnik3 = new Korisnik();
		korisnik3.setKorisnickoIme("jozobozo");
		korisnik3.setLozinka("jozobozo123");

		//Upis korisnika u bazu
		kRepo.save(korisnik1);
		kRepo.save(korisnik2);
		kRepo.save(korisnik3);
	}

}
