package core.accountServices.Google;

import core.accountServices.AccountService;


public class GoogleAccountAdapter implements AccountService{

	@Override
	public boolean validate(String email) {
		if(!email.contains("@gmail.com")) {
			return false;
		}
		return true;
		
	}


}
