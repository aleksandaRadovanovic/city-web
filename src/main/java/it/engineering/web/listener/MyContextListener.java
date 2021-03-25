package it.engineering.web.listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import it.engineering.web.model.City;
import it.engineering.web.model.Manufacturer;
import it.engineering.web.model.Product;
import it.engineering.web.model.User;

@WebListener("Configuration")
public class MyContextListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent sce)  { 
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	
    	List<User> users = new ArrayList<>();
    	users.add(new User("Admin", "admin@eng.it", "admin123"));
    	users.add(new User("Paul", "paul@eng.it", "paul123"));
    	users.add(new User("John", "john@eng.it", "john123"));
    	
    	sce.getServletContext().setAttribute("users", users);
    	
    	
    	List<City> operations = new ArrayList<City>();
    	operations.add(new City("Valjevo", "14000"));
    	sce.getServletContext().setAttribute("cities", operations);
    	
    	List<Manufacturer> operManufacturers = new ArrayList<Manufacturer>();
    	sce.getServletContext().setAttribute("manufacturerList", operManufacturers);
    	
    	List<Product> operProducts = new ArrayList<Product>();
    	operProducts.add(new Product(1, "aaa", 1, "aaa", "aaa", 2, "aaa"));
    	sce.getServletContext().setAttribute("productList", operProducts);
    }
	
}
