package it.engineering.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.model.City;

import java.util.List;

/**
 * Servlet implementation class CityServlet
 */
@WebServlet(urlPatterns = {"/city"})
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

		String indexParam = request.getParameter("index");
		int index = Integer.parseInt(indexParam);
		String opr = request.getParameter("opr");
		
		if(request.getParameter("opr").equals("delete")) {
			@SuppressWarnings("unchecked")
			List<City> list = (List<City>) request.getServletContext().getAttribute("cities");
			list.remove(index);
//			request.getRequestDispatcher("/WEB-INF/pages/city-list.jsp").forward(request, response);
			request.getRequestDispatcher("/navigation?link=list&entity=city").forward(request, response);
		}else if(request.getParameter("opr").equals("details")) {
			@SuppressWarnings("unchecked")
			List<City> list = (List<City>) request.getServletContext().getAttribute("cities");
			request.getRequestDispatcher("/navigation?link=add&entity=city").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String naziv = request.getParameter("naziv");
		String postanskiBroj = request.getParameter("postBroj");
		
		int postBroj = 0;
		
		boolean validation = true;
		City cityDto = new City();
		
		cityDto.setNaziv(naziv);	
		try {
			postBroj = Integer.parseInt(postanskiBroj);
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
		request.getRequestDispatcher("/WEB-INF/pages/city-add.jsp").forward(request, response);
	}
	
	@SuppressWarnings("unchecked")
	private void saveCity(City cityDto, HttpServletRequest request) {
		((List<City>)request.getServletContext().getAttribute("cities")).add(cityDto);
	}
}





