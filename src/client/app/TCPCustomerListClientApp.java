package client.app;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.List;

import model.Customer;
import client.view.CustomerView;

public class TCPCustomerListClientApp {

	public static void main(String[] args) {
		
		try {
			// server information
			int serverPortNo = 8088;
			InetAddress serverAddress = InetAddress.getLocalHost();
			
			// 1. Connect to remote machine
			Socket socket = new Socket(serverAddress, serverPortNo);
			
			// Create stream to receive response from server
			InputStream is = socket.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			
			// 3. Read respond from the server - cast the object
			List<Customer> customers = (List<Customer>) ois.readObject();
			
			//4. Process response - display the object
			CustomerView viewer = new CustomerView();
			viewer.displayCustomer(customers);
			
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
}
