package Concrete;

import java.util.Date;

import Abstract.IdentityCheckService;
import Entities.Customer;

public class PersonCheckManager implements IdentityCheckService{

	@Override
	public  Boolean checkPerson(Customer customer) {
		if(customer.firstName.toLowerCase()=="arma�an" && customer.lastName.toLowerCase() == "�ahin" && 
				customer.identityNumber=="123456789123" && customer.dateOfBirth == new Date(19-5-1995)) {
			return true;
		}
		return false;
	}
   
}
