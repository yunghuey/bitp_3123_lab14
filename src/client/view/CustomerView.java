package client.view;

import java.util.List;

import model.Customer;
public class CustomerView {
	
	public void displayCustomer(List<Customer> customers) {
		
		// Some information about the record
		System.out.println("\tNumber of record: " + customers.size());
		System.out.println("\tCustomer Information");
		
		// print all customers on console
		for(Customer c:customers) {
			
			System.out.println("\tCustomer ID: " + c.getCustomerId());
			System.out.println("\tCustomer name: " + c.getCustomerName() + "\n");	
		
		}
	}
}
