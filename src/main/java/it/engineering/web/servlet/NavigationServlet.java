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
		
		if(link != null) {
			switch (link) {
			case "add":
				request.setAttribute("message", "Dodaj novi grad");
				page = "/city-add.jsp";
				break;
			case "list":
				request.setAttribute("message", "Svi gradovi");
				page = "/city-list.jsp";
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
