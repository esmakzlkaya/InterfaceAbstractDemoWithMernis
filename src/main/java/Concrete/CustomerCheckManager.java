package Concrete;

import Abstract.CustomerCheckService;
import Entity.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}

}
