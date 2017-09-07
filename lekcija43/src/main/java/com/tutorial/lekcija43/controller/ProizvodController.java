package com.tutorial.lekcija43.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.lekcija43.model.Proizvod;
import com.tutorial.lekcija43.repository.ProizvodRepository;

@RestController
@RequestMapping(path="/api/products/")
public class ProizvodController {

	private ProizvodRepository proizvodRepository;
	
	private Logger LOG = LoggerFactory.getLogger(ProizvodController.class);

	@Autowired
	public void proizvodRepository(ProizvodRepository proizvodRepository) {
		this.proizvodRepository = proizvodRepository;
	}

	/**
	 * Dohvačanje proizvoda 
	 * 
	 * @param id 
	 * @return Proizvod Objekt konvertiran u JSON
	 */
	
	@RequestMapping(path="{id}", method=RequestMethod.GET)
	public Proizvod getProizvod(@PathVariable(name="id") String id) {
		// TODO fix this bug findOne
		return proizvodRepository.findOne(id);
	}
	
	/**
	 * Spremanje proizvoda u bazu
	 * 
	 * @param proizvodZaSpremanje
	 * @return spremljeni proizvod 
	 */
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Proizvod spremiProizvod(@RequestBody Proizvod proizvodZaSpremanje) {
		
		LOG.info("POSTani JSON: " + proizvodZaSpremanje.toString());
		
		
		return proizvodRepository.save(proizvodZaSpremanje);
	}

	
	/**
	 * Uređivanje proizvoda po ID-u 
	 * 
	 * @param proizvodZaUpdate
	 * @param id
	 * @return uređeni Proizvod 
	 */
	@RequestMapping(path = "{id}", method=RequestMethod.PUT,consumes = MediaType.APPLICATION_JSON_VALUE)
	public Proizvod updateProizvod(@RequestBody Proizvod proizvodZaUpdate, @PathVariable(name="id") String id) {
		Proizvod nadjeniProizvod = proizvodRepository.findOne(id);
		if (nadjeniProizvod != null) {
			LOG.info("Nadjen: " + nadjeniProizvod.toString());
			nadjeniProizvod.setNaziv(proizvodZaUpdate.getNaziv());
			nadjeniProizvod.setOpis(proizvodZaUpdate.getOpis());
			nadjeniProizvod.setTip(proizvodZaUpdate.getTip());
			nadjeniProizvod.setKategorija(proizvodZaUpdate.getKategorija());
			return proizvodRepository.save(nadjeniProizvod);
		} else {
			LOG.info("No product found for this id.");
			return proizvodZaUpdate;
		}
		
	}
	
	/**
	 * brisanje proizvoda 
	 * 
	 * @param id
	 */
	@RequestMapping(path="{id}", method=RequestMethod.DELETE)
	public void brisanjeProizvoda(@PathVariable(name="id") String id) {
		
		Proizvod nadjeniProizvod = proizvodRepository.findOne(id);
		
		if(nadjeniProizvod != null) {
			proizvodRepository.delete(nadjeniProizvod);
		}
		
		
	}
	
}
