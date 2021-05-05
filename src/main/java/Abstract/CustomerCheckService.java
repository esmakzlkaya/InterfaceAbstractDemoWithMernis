package Abstract;

import java.net.MalformedURLException;

import Entity.Customer;

public interface CustomerCheckService {

public boolean CheckIfRealPerson(Customer customer) throws MalformedURLException;
}
