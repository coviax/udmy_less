package com.tutorial.product.model;

public class Proizvod {
	private int id;
	private String naziv;
	private String opis; 
	private int cijena;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String name) {
		this.naziv = name;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String description) {
		this.opis = description;
	}
	public int getCijena() {
		return cijena;
	}
	public void setCijena(int price) {
		this.cijena = price;
	}
	
	@Override
	public String toString() {
		return "Proizvod [id=" + id + ", naziv=" + naziv + ", opis=" + opis + ", cijena=" + cijena + "]";
	} 
	
	
	
}
