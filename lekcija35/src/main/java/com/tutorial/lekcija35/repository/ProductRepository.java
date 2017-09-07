package com.tutorial.lekcija35.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.lekcija35.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String>{

	Product findByType(String type);
	
	List<Product> findByDescriptionAndCategory(String description,String category);
	
	List<Product> findByCategoryAndNameIn(String category, List<String> name);
	
	
}
