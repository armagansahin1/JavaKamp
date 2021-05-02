package Abstract;

import Entities.Customer;

public  class BaseDatabaseManager implements CustomerService{

	@Override
	public void add(Customer customer) {
		
		System.out.println("Veritabanýna kaydedildi : " + customer.firstName);
	}
  
}
