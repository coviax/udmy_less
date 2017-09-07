package com.tutorial.lekcija37;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tutorial.lekcija37.model.GeneratorPodataka;
import com.tutorial.lekcija37.repository.KorisnikRepository;
import com.tutorial.lekcija37.repository.ProizvodRepository;

@SpringBootApplication
public class Lekcija37Application implements CommandLineRunner {

	private Logger LOG = LoggerFactory.getLogger(Lekcija37Application.class);
	
	private ProizvodRepository proizvodRepository;
	
	private KorisnikRepository korisnikRepository;
	
	@Autowired
	public void ProizvodRepository(ProizvodRepository proizvodRepository) {
		this.proizvodRepository = proizvodRepository;
	}

	@Autowired
	public void KorisnikRepository(KorisnikRepository korisnikRepository) {
		this.korisnikRepository = korisnikRepository;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Lekcija37Application.class, args);
	}
	
	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
		GeneratorPodataka generator = new GeneratorPodataka();	
		generator.postaviPodatke(korisnikRepository, proizvodRepository);

	}
	
	
	
	
	
	
	
}
