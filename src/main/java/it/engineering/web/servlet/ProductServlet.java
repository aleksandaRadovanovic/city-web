package it.engineering.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.model.City;
import it.engineering.web.model.Product;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet(urlPatterns = {"/product"})
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String indexParam = request.getParameter("index");
		int index = Integer.parseInt(indexParam);
		String opr = request.getParameter("opr");
		
		if(request.getParameter("opr").equals("delete")) {
			@SuppressWarnings("unchecked")
			List<Product> list = (List<Product>) request.getServletContext().getAttribute("productList");
			list.remove(index);
			request.getRequestDispatcher("/navigation?link=list&entity=product").forward(request, response);
		}else if(request.getParameter("opr").equals("details")) {
			@SuppressWarnings("unchecked")
			List<Product> list = (List<Product>) request.getServletContext().getAttribute("productList");
			request.getRequestDispatcher("/navigation?link=add&entity=product").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String sifraProd = request.getParameter("sifraProizvoda");
		String nazivProizvoda = request.getParameter("nazivProizvoda");
		String jedCena = request.getParameter("jedinicnaCena");
		String mernaJedinica = request.getParameter("mernaJedinica");
		String valuta = request.getParameter("valuta");
		String porStopa = request.getParameter("poreskaStopa");
		String proizvodjac = request.getParameter("proizvodjac");
		
		int sifraProizvoda = 0;
		double jedinicnaCena = 0;
		double poreskaStopa = 0;
		
		boolean validation = true;
		Product productDto = new Product();
		
		try {
			sifraProizvoda = Integer.parseInt(sifraProd);
			productDto.setSifraProizvoda(sifraProizvoda);
		}catch (NumberFormatException nfe) {
			request.setAttribute("errorA", "Sifra proizvoda mora biti broj");
			validation = false;
		}
		productDto.setNazivProizvoda(nazivProizvoda);
		try {
			jedinicnaCena = Double.parseDouble(jedCena);
			productDto.setJedinicnaCena(jedinicnaCena);
		}catch (NumberFormatException nfe) {
			request.setAttribute("errorB", "Jedinicna cena mora biti broj");
			validation = false;
		}
		productDto.setMernaJedinica(mernaJedinica);
		productDto.setValuta(valuta);
		try {
			poreskaStopa = Double.parseDouble(porStopa);
			productDto.setPoreskaStopa(poreskaStopa);
		}catch (NumberFormatException nfe) {
			request.setAttribute("errorC", "Poreska stopa mora biti broj");
			validation = false;
		}
		productDto.setProizvodjacNaziv(proizvodjac);
		
		if(validation) {
			if(request.getParameter("operation").equals("dodaj proizvod")) {
				request.setAttribute("message", "Proizvod je uspesno dadat");
				saveProduct(productDto, request);
			}else {
				request.setAttribute("message", "Grska pri dodavanju proizvoda");
			}
		}else {
			request.setAttribute("message", "Grska pri dodavanju proizvoda");
		}
		request.setAttribute("productDto", productDto);
		request.getRequestDispatcher("/WEB-INF/pages/product-add.jsp").forward(request, response);
	}

	@SuppressWarnings("unchecked")
	private void saveProduct(Product productDto, HttpServletRequest request) {
		((List<Product>)request.getServletContext().getAttribute("productList")).add(productDto);
	}	
}
