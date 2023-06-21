package server.controller;
import java.util.ArrayList;
import java.util.List;

import model.Customer;

/***
 * This class manage customer data
 * @author yungh
 *
 */
public class CustomerDataManager {

	private List<Customer> customers;
	
	public CustomerDataManager() {
		
		this.customers = new ArrayList<Customer>();
		this.loadCustomers();
	}
	
	/**
	 * This method creates a list of 10 samples of customer data
	 */
	private void loadCustomers() {
		
		// sample data
		int ids[] = {2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010};
		String names[] = {"Aurelia", "Agnes", "Caryn", "Daphine", "Maxwell", 
						  "Slyvia", "Justin", "Winnie", "Zach", "Percy"};
		
		for (int index = 0; index < ids.length; index++) {
			
			// create customer
			Customer customer = new Customer();
			customer.setCustomerId(ids[index]);
			customer.setCustomerName(names[index]);
			
			// add to list
			customers.add(customer);
		}
	}
	
	/***
	 * This method find customer by name
	 * @param name
	 * @return Customer object
	 */
	public Customer getCustomerByName(String name) {
		// Find a product
		for(Customer c:customers) {
			if(c.getCustomerName().contains(name)) {
				return c;
			}
		}
		
		// return customer not found
		Customer unfoundCustomer = new Customer();
		unfoundCustomer.setCustomerName("Customer not found");
		
		return unfoundCustomer;
	}
	
	/***
	 * This method find customer by ID
	 * @param id
	 * @return
	 */
	public Customer getCustomerById(int id) {
		// Find a product
		for(Customer c:customers) {
			if(c.getCustomerId() == id) {
				return c;
			}
		}
		
		// return customer not found
		Customer unfoundCustomer = new Customer();
		unfoundCustomer.setCustomerName("Customer not found");
		
		return unfoundCustomer;
	}
	
	
	/***
	 * This method will return a list of customers
	 * @return
	 */
	public List<Customer> getAllCustomers(){
		return customers;
	}
}
