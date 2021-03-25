package it.engineering.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NavigationServlet2
 */
@WebServlet(urlPatterns = {"/navigation","/nav"})
public class NavigationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NavigationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String link = request.getParameter("link");
		String page = "home.jsp";
		String entity = request.getParameter("entity");
		
		if(link != null) {
		switch (link) {
		case "add":
			switch(entity) {
			case "city":
				request.setAttribute("message", "Dodaj novi grad");
				page = "/WEB-INF/pages/city-add.jsp";
				break;
			case "manufacturer":
				request.setAttribute("message", "Dodaj novog proizvodjaca");
				page = "/WEB-INF/pages/manufacturer-add.jsp";
				break;
			case "product":
				request.setAttribute("message", "Dodaj novi proizvod");
				page = "/WEB-INF/pages/product-add.jsp";
				break;
			}
			break;
		case "list":
			switch(entity) {
			case "city":
				request.setAttribute("message", "Svi gradovi");
				page = "/WEB-INF/pages/city-list.jsp";
				break;
			case "manufacturer":
				request.setAttribute("message", "Svi proizvodjaci");
				page = "/WEB-INF/pages/manufacturer-list.jsp";
				break;
			case "product":
				request.setAttribute("message", "Svi proizvodi");
				page = "/WEB-INF/pages/product-list.jsp";
				break;
			}
		default:
			request.setAttribute("message", "Link nije definaisan");
			break;
		}
	}else {
		request.setAttribute("message", "Nije prosledjen parametar link...");
	}
	request.getRequestDispatcher(page).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
