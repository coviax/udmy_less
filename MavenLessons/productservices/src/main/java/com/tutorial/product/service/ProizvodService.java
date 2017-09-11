/**
 * 
 */
package com.tutorial.product.service;

import com.tutorial.product.model.Proizvod;

/**
 * @author dpondeljak
 *
 */
public interface ProizvodService {

	/**
	 * Kreiranje proizvoda
	 * @param pProizvod
	 * void
	 */
	public void createProizvod(Proizvod pProizvod);
	
	/**
	 * Dohvat proizvoda 
	 * @param pId
	 * void
	 */
	public Proizvod findProizvod(int pId);
	
}
