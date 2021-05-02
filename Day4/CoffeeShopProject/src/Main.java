import java.util.Date;
import Abstract.CustomerService;
import Adapters.KPSServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StartbucksManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.identityNumber="11189245922";
		customer.firstName="armaðan";
		customer.lastName="þahin";
		customer.dateOfBirth=new Date(1995,5,19);
		
		CustomerService customerService = new StartbucksManager(new KPSServiceAdapter());
		customerService.add(customer);
		
		CustomerService customerService2=new NeroCustomerManager();
		customerService2.add(customer);
		 
	}

}
