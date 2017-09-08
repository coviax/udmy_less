package com.tutorial.product.sevice;

import com.tutorial.product.dao.ProizvodDAO;
import com.tutorial.product.model.Proizvod;

public class ProizvodServiceImpl implements ProizvodService {

	private ProizvodDAO iDao;
	
	@Override
	public void createProizvod(Proizvod pProizvod) {
		iDao.createProizvod(pProizvod);
	}

	@Override
	public Proizvod findProizvod(int pId) {
		return iDao.readProizvod(pId);
	}

	
	public ProizvodDAO getDao() {
		return iDao;
	}

	
	public void setIdao(ProizvodDAO pDao) {
		this.iDao = pDao;
	}

	
	
}
