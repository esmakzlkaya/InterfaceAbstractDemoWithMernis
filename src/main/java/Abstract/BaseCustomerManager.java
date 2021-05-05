package Abstract;

import java.net.MalformedURLException;

import Entity.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	public void save(Customer customer) throws MalformedURLException {
		System.out.println("Saved to db : "+customer.getFirstName());
	}
}
