import java.net.URL;
import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entity.Customer;
import tr.gov.nvi.tckimlik.ws.KPSPublic;
import tr.gov.nvi.tckimlik.ws.KPSPublicSoap;

import java.net.MalformedURLException;
import java.net.URI;

public class Main {

	public static void main(String[] args) throws MalformedURLException {
		Customer customer1=new Customer();
		customer1.setId(1);
		customer1.setFirstName("Esma");
		customer1.setLastName("Kýzýlkaya");
		customer1.setDateOfBirth(1998);
		customer1.setNationalityId("Tckimlikno");
		
		
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer1);
	}

}
