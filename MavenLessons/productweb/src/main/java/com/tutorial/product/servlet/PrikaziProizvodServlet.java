package com.tutorial.product.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.tutorial.product.model.Proizvod;
import com.tutorial.product.service.ProizvodService;

/**
 * Servlet implementation class PrikaziProizvodServlet
 */
public class PrikaziProizvodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest pRequest, HttpServletResponse pResponse) throws ServletException, IOException {
		WebApplicationContext tContext = WebApplicationContextUtils.getRequiredWebApplicationContext(this
				.getServletContext());
		ProizvodService tService = (ProizvodService) tContext.getBean("proizvodservice");
		Proizvod tProizvod = tService.findProizvod(Integer.parseInt(pRequest.getParameter("id")));

		PrintWriter tOut = pResponse.getWriter();

		tOut.print("Detalji Proizvoda:");
		tOut.print("\nID Proizvoda:" + tProizvod.getId());
		tOut.print("\nNaziv Proizvoda:" + tProizvod.getNaziv());
		tOut.print("\nOpis Proizvoda:" + tProizvod.getOpis());
		tOut.print("\nCijena Proizvoda:" + tProizvod.getCijena());
	}

}
