package model;
import java.io.Serializable;

/***
 * This class represent the model of a Customer
 * @author yungh
 *
 */
public class Customer implements Serializable {

	private int customerId;
	private String customerName;
	
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
}
