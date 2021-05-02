package Concrete;

import Abstract.BaseDatabaseManager;
import Abstract.IdentityCheckService;
import Entities.Customer;

public class StartbucksManager extends BaseDatabaseManager{
 
	IdentityCheckService identityCheckService;
	public StartbucksManager(IdentityCheckService identityCheckService) {
		
		this.identityCheckService = identityCheckService;
	}
	@Override
	public void add(Customer customer) {
	    if(this.identityCheckService.checkPerson(customer)) {
	    	super.add(customer);
	    }
	    else {
	    	System.out.println("Kiþi Bulunamadý");
	    }
	}
 
	

}
