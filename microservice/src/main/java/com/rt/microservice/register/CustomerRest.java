package com.rt.microservice.register;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.rt.microservice.DAO.CustomerDAO;
import com.rt.microservice.domain.Customer;

@Named
@Path("/")
public class CustomerRest {
	private static CustomerDAO customerDAO= new CustomerDAO();
	
	private static ArrayList<Customer> customers = customerDAO.customerList();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Customer> getCustomers() {
		return customers;
	}

	@GET
	@Path("customer")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getCustomer(@QueryParam("id") long id) {
		Customer cli = null;
		for (Customer c : customers) {
			if (c.getId() == id)
				cli = c;
		}
		return cli;
	}
}
