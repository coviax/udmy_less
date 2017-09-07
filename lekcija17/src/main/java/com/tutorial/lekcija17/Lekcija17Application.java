package com.tutorial.lekcija17;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.lekcija17.utils.DateTimeUtils;

@SpringBootApplication
public class Lekcija17Application {

	public static void main(String[] args) {
		SpringApplication.run(Lekcija17Application.class, args);
	}
}



@RestController
@RequestMapping(path = "/")
class SpringPrvaAplikacija {
	
	private DateTimeUtils danas = new DateTimeUtils(); 
	
	
	@RequestMapping(value="help/{name}", method = RequestMethod.GET)
	public String help(@PathVariable(value="name") String qryParametar) {
		
		
		
		String varijabla = "Dobro došli";
		
		String tagNoviRedHtml = "<br />";
		
		varijabla = varijabla + ": " + qryParametar + "! \n" + tagNoviRedHtml + "Danas je: " + danas.getDanasnjiDatum();
		
		return varijabla;
	}
	

}