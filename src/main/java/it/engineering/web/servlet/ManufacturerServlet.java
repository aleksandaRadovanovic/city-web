package it.engineering.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.model.Manufacturer;

/**
 * Servlet implementation class ManufacturerServlet
 */
@WebServlet(urlPatterns = {"/manufacturer"})
public class ManufacturerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManufacturerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String indexParam = request.getParameter("index");
		int index = Integer.parseInt(indexParam);
		
		@SuppressWarnings("unchecked")
		List<Manufacturer> list = (List<Manufacturer>) request.getServletContext().getAttribute("manufacturerList");
		list.remove(index);
		request.getRequestDispatcher("/navigation?link=list").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nazivProizvodjaca = request.getParameter("naziv");
		String pibStr = request.getParameter("pib");
		int pib = Integer.parseInt(pibStr);
		String maticniBroj = request.getParameter("maticniBroj");
		String adresa = request.getParameter("adresa");
		String gradNaziv = request.getParameter("grad");
		
		boolean validation = true;
		Manufacturer manDto = new Manufacturer();
		
		manDto.setNazivProizvodjaca(nazivProizvodjaca);
		try {
			manDto.setPib(pib);
		}catch (NumberFormatException nfe) {
			request.setAttribute("error", "PIB broj " + pib + " mora biti broj");
			validation = false;
		}
		manDto.setPib(pib);
		manDto.setMaticniBroj(maticniBroj);
		manDto.setAdresa(adresa);
		manDto.setGradNaziv(gradNaziv);
		
		if(validation) {
			if(request.getParameter("operation").equals("dodajProizvodjaca")) {
				request.setAttribute("message", "Proizvodjac je uspesno dodat");
				saveManufacturer(manDto, request);
			}else {
				request.setAttribute("message", "Greska pri dodavanju grada");
			}
		}else {
			request.setAttribute("message", "Greska pri dodavanju grada");
		}
		request.setAttribute("manDto", manDto);
		request.getRequestDispatcher("/WEB-INF/pages/manufacturer-add.jsp");
	}
	
	@SuppressWarnings("unchecked")
	private void saveManufacturer(Manufacturer manDto, HttpServletRequest request) {
		((List<Manufacturer>)request.getServletContext().getAttribute("manufacturerList")).add(manDto);
	}

}
