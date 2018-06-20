package hibernate1;

import java.util.List;

public interface CustomerD {

	public abstract boolean saveCustomer(final Customer customer);
	
	public abstract boolean updateCustomer(final Customer customer);
	
	public abstract boolean removeCustomer(final Customer customer);
	
	public abstract Customer getCustomer(final int customerId);
	
	public abstract List<Customer> getAllCustomers();
}
