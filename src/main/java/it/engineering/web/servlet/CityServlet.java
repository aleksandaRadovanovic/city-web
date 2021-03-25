package it.engineering.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.model.City;

/**
 * Servlet implementation class CityServlet
 */
public class CityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CityServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String naziv = request.getParameter("naziv");
		String postBroj = request.getParameter("postBroj");
		
		boolean validation = true;
		City cityDto = new City();
		
		cityDto.setNaziv(naziv);	
		try {
			cityDto.setPostBroj(postBroj);
		}catch (NumberFormatException nfe) {
			request.setAttribute("error", "Postanski broj " + postBroj + " mora biti broj");
			validation = false;
		}
		
		if(validation) {
			if(request.getParameter("operation").equals("dodaj")) {
				request.setAttribute("message", "Grad je uspesno daodat");
				saveCity(cityDto, request);
			}else {
				request.setAttribute("message", "Grska pri dodavanju grada");
			}
		}else {
			request.setAttribute("message", "Grska pri dodavanju grada");
		}
		request.setAttribute("cityDto", cityDto);
		request.getRequestDispatcher("/city-add.jsp").forward(request, response);
	}
	
	@SuppressWarnings("unchecked")
	private void saveCity(City cityDto, HttpServletRequest request) {
		((List<City>)request.getServletContext().getAttribute("cities")).add(cityDto);
	}
}





