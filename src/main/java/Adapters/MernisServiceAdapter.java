package Adapters;

import java.net.MalformedURLException;
import java.net.URL;

import Abstract.CustomerCheckService;
import Entity.Customer;
import tr.gov.nvi.tckimlik.ws.KPSPublic;
import tr.gov.nvi.tckimlik.ws.KPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws MalformedURLException {
		String endpoint= "https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx";
		URL url=java.net.URI.create(endpoint).toURL();
		
		KPSPublic service= new KPSPublic(url);
		KPSPublicSoap port=service.getPort(KPSPublicSoap.class);
		return port.tcKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth());

	}

}
