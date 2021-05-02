package Adapters;

import Abstract.IdentityCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


import java.rmi.RemoteException;


public class KPSServiceAdapter implements IdentityCheckService{


	@Override
	public Boolean checkPerson(Customer customer) {
		 
		
		KPSPublicSoap client = new KPSPublicSoapProxy();
		
		
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.identityNumber), customer.firstName, customer.lastName, customer.dateOfBirth.getYear());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
  
}
