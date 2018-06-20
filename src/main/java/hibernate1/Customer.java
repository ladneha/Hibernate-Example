package hibernate1;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@SuppressWarnings("serial")
@Entity
@Table(name = "customer")
public class Customer implements Serializable {
	
	@Id
	@Column(name = "customerId")
	private int customerId;
	@Column(name = "customerName")
	private String customerName;
	@Column(name = "customerCity")
	private String customerCity;

	
	public int getCustomerId() {
		return customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}
}
