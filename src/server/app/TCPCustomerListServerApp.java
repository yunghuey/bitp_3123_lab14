package server.app;

import java.io.DataInputStream;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

import model.Customer;
import server.controller.CustomerDataManager;

/***
 * This is server side to get Customer List
 * @author yungh
 *
 */
public class TCPCustomerListServerApp {

	public static void main(String[] args) {
		
		// declare port number
		int portNo = 8088;
		
		// declare manager object
		CustomerDataManager manager = new CustomerDataManager();
	
		System.out.println("\n\tExecuting TCP Customer List Server App");
		
		try {
			System.out.println("\tWaiting for next request");

			// 1. Bind to port
			ServerSocket serverSocket = new ServerSocket(portNo);
			
			// 2. Server need to continually run to listen to request
			while(true) {
				
				// 3. Accept request from client
				Socket clientSocket = serverSocket.accept();
				
				// Get customer
				List<Customer> customers = manager.getAllCustomers();
				
				// 4. Respond to client
				OutputStream os = clientSocket.getOutputStream();
				ObjectOutputStream oos = new ObjectOutputStream(os);
				oos.writeObject(customers);
				System.out.println("\tSending : " + customers.size() 
					+ " customers");			
			}
			
		} catch(Exception ex) {
			
			ex.printStackTrace();
		}
	
	
	
	
	
	
	
	
	}
}
