package com.tutorial.product.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.tutorial.product.service.ProizvodService;
import com.tutorial.product.model.Proizvod;

/**
 * Servlet implementation class CreateProductServlet
 */
public class KreirajProizvodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest tRequest, HttpServletResponse pResponse) throws ServletException,
			IOException {

		Integer tId = Integer.parseInt(tRequest.getParameter("id"));
		String tNaziv = tRequest.getParameter("naziv");
		String tOpis = tRequest.getParameter("opis");
		Integer tCijena = Integer.parseInt(tRequest.getParameter("cijena"));

		Proizvod tProizvod = new Proizvod();
		tProizvod.setId(tId);
		tProizvod.setNaziv(tNaziv);
		tProizvod.setOpis(tOpis);
		tProizvod.setCijena(tCijena);
		
		WebApplicationContext tContext = WebApplicationContextUtils.getRequiredWebApplicationContext(this.getServletContext());
		ProizvodService tService = (ProizvodService) tContext.getBean("proizvodservice");
		tService.createProizvod(tProizvod);
		
		PrintWriter tOut = pResponse.getWriter();
		tOut.print("Proizvod Kreiran!!!");
		
		
	}

}