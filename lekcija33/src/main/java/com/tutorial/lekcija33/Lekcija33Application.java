package com.tutorial.lekcija33;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tutorial.lekcija33.model.Product;
import com.tutorial.lekcija33.repository.ProductRepository;

@SpringBootApplication
public class Lekcija33Application implements CommandLineRunner {

	private ProductRepository productRepository;

	private Logger LOG = LoggerFactory.getLogger(Lekcija33Application.class);

	@Autowired
	public void productRepository(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(Lekcija33Application.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		
		Product product1 = new Product();
		product1.setName("Test proizvod");
		product1.setDescription("This is the test proizvod");
		product1.setCategory("TEST");
		product1.setType("GENERAL");
		product1.setPrice(0.0);
		
		productRepository.save(product1);
		
		Product product2 = new Product();
		product2.setName("Test proizvod2");
		product2.setDescription("This is the test proizvod");
		product2.setCategory("TEST");
		product2.setType("CUSTOM");
		product2.setPrice(15.0);
		
		productRepository.save(product2);
	
		Product product3 = new Product();
		product3.setName("Test proizvod");
		product3.setDescription("description");
		product3.setCategory("TEST");
		product3.setType("SPECIFIC");
		product3.setPrice(19.0);
		
		productRepository.save(product3);		
		
		// List<Product> products = productRepository.findAll();
	
		
		// for(Product product : products) {
		//	LOG.info("Products found:" + product.toString());
		// }
		
//		Product resultProduct = productRepository.findByType("GENERAL");
//		LOG.info("GENERAL Type: " + resultProduct.toString());
		
//		List<Product> results = productRepository.findByDescriptionAndCategory("This is the test proizvod", "TEST");
	
//		for(Product product : results) {
//			LOG.info("Products found:" + product.toString());
//		}
	
		List<String> names = new ArrayList<>();
		names.add("Test proizvod");
		//names.add("Test proizvod2");
		
		List<Product> resultProducts = productRepository.findByCategoryAndNameIn("TEST", names);
		
		for(Product product : resultProducts) {
			LOG.info("Products found (findByCategoryAndNameIn): " + product.toString());
		}
		
		
	}

}
