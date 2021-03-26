package it.engineering.web.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.engineering.web.model.User;

@WebServlet(urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		boolean found = false;
		
		@SuppressWarnings("unchecked")
		List<User> users = (List<User>) getServletContext().getAttribute("users");
		for(User u : users) {
			if(u.getEmail().equals(email) && u.getPassword().equals(password)) {
				found = true;
			}
		}
		if(found) {
			request.getRequestDispatcher("/WEB-INF/pages/home.jsp").forward(request, response);
		}else {
			request.setAttribute("message", "Email ili sifra nisu ispravni, pokusajte ponovo");
			request.getRequestDispatcher("/index.jsp").forward(request, response);
		}
	}

}
