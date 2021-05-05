package Abstract;

import java.net.MalformedURLException;

import Entity.Customer;

public interface CustomerService {

	void save(Customer customer) throws MalformedURLException;
}
