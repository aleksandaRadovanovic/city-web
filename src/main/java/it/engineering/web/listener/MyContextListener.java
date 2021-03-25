package it.engineering.web.listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import it.engineering.web.model.User;

@WebListener("Configuration")
public class MyContextListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent sce)  { 
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	
    	List<User> users = new ArrayList<>();
    	users.add(new User("Admin", "admin", "admin123"));
    	users.add(new User("Paul", "paul", "paul123"));
    	users.add(new User("John", "john", "john123"));
    	
    	sce.getServletContext().setAttribute("users", users);
    }
	
}
