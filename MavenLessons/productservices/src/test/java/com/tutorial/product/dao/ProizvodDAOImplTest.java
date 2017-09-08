package com.tutorial.product.dao;

import static org.junit.Assert.*;
import org.junit.Test;

import com.tutorial.product.model.Proizvod;

public class ProizvodDAOImplTest {

	@Test
	public void createKreiranjeProizvoda() {
		
		ProizvodDAO tDao = new ProizvodDAOImpl();
		
		Proizvod tProizvod = new Proizvod();
		
		tProizvod.setId(1);
		tProizvod.setNaziv("TestProizvod");
		tProizvod.setOpis("Opis test Proizvoda");
		tProizvod.setCijena(800);
		
		tDao.createProizvod(tProizvod);
		
		Proizvod tRezultat = tDao.readProizvod(1);
		
		assertNotNull(tRezultat);
		
		assertEquals("TestProizvod", tRezultat.getNaziv());
		
	}

}
