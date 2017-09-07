package com.tutorial.lekcija43;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tutorial.lekcija43.model.Proizvod;
import com.tutorial.lekcija43.repository.ProizvodRepository;



@SpringBootApplication
public class Lekcija43Application implements CommandLineRunner {

	private ProizvodRepository proizvodRepository;
	
	@Autowired	
	public void proizvodRepository(ProizvodRepository proizvodRepository) {
		this.proizvodRepository = proizvodRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(Lekcija43Application.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		
		Proizvod testProizvod = new Proizvod();
		testProizvod.setNaziv("Test Proizvod");
		testProizvod.setKategorija("SPECIAL");
		testProizvod.setOpis("Opis Test proizvoda");
		testProizvod.setTip("CUSTOM");
		
		proizvodRepository.save(testProizvod);

	}


}
