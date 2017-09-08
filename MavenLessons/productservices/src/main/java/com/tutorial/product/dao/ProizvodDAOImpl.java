/**
 * 
 */
package com.tutorial.product.dao;

import java.util.HashMap;
import java.util.Map;

import com.tutorial.product.model.Proizvod;

/**
 * @author dpondeljak
 *
 */
public class ProizvodDAOImpl implements ProizvodDAO {

	Map<Integer, Proizvod> iProizvod = new HashMap<>();
	
	
	@Override
	public void createProizvod(Proizvod pProizvod) {
		// TODO Auto-generated method stub
		iProizvod.put(pProizvod.getId(), pProizvod);

	}

	@Override
	public Proizvod readProizvod(int pId) {
		// TODO Auto-generated method stub
		return iProizvod.get(pId);
	}

	@Override
	public void updateProizvod(Proizvod pProizvod) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteProizvod(int pId) {
		// TODO Auto-generated method stub

	}

}
