package com.tutorial.product.dao;

import com.tutorial.product.model.Proizvod;

public interface ProizvodDAO {
	
	/**
	 * Kreiranje proizvoda 
	 * 
	 * @param pProizvod
	 */
	void createProizvod(Proizvod pProizvod);
	
	/**
	 * Dohvat proizvoda
	 * 
	 * @param pId
	 * @return Proizvod objekt
	 */
	Proizvod readProizvod(int pId);
	
	/**
	 * Uređivanje proizvoda
	 * 
	 * @param pProizvod
	 * void
	 */
	void updateProizvod(Proizvod pProizvod);
	
	/**
	 * Brisanje proizvoda
	 * 
	 * @param pId
	 * void
	 */
	void deleteProizvod(int pId);
}
