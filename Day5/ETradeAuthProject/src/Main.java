import business.abstracts.AuthService;
import business.abstracts.UserService;
import business.concretes.AuthManager;
import business.concretes.UserManager;
import business.validationTools.Regex.AuthValidator;
import dataAccess.concretes.HibernateUserDal;
import core.accountServices.Google.GoogleAccountAdapter;
import core.entities.dtos.LoginDto;
import core.entities.dtos.RegisterDto;



public class Main {

	public static void main(String[] args) {
		
		UserService userService=new UserManager(new HibernateUserDal());
	     AuthService authService = new AuthManager(userService,new AuthValidator(),new GoogleAccountAdapter());
	     
	     authService.register(new RegisterDto("armagan","sahin","armagan.sahin95@gmail.com","21313135")); //Doðru kayýt
	     
	     authService.register(new RegisterDto("armaðan","þahin","armagan.sahin95asdaasd","12213215")); //Hatalý kayýt
	     
	     authService.register(new RegisterDto("armaðan","þahin","armagan.sahin95@hotmail.com","12213215")); // Gmail hatasý
	     
	     authService.register(new RegisterDto("armagan","sahin","armagan.sahin95@gmail.com","21313135"));  //Kayýtlý mail adresi hatasý
	     
	     authService.login(new LoginDto("armagan.sahin95@gmail.com","21313135")); // Doðru giriþ
	     
	     authService.login(new LoginDto("armagan.sahin95@gmail.com","2fdsfs35")); // Yanlýþ þifre ile giriþ
	     
	     authService.login(new LoginDto("armagan.sin95@gmail.com","2fdsfs35")); // Yanlýþ mail ile giriþ
	     
	    
	     
	     
	}

}
