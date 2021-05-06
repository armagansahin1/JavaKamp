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
	     
	     authService.register(new RegisterDto("armagan","sahin","armagan.sahin95@gmail.com","21313135")); //Do�ru kay�t
	     
	     authService.register(new RegisterDto("arma�an","�ahin","armagan.sahin95asdaasd","12213215")); //Hatal� kay�t
	     
	     authService.register(new RegisterDto("arma�an","�ahin","armagan.sahin95@hotmail.com","12213215")); // Gmail hatas�
	     
	     authService.register(new RegisterDto("armagan","sahin","armagan.sahin95@gmail.com","21313135"));  //Kay�tl� mail adresi hatas�
	     
	     authService.login(new LoginDto("armagan.sahin95@gmail.com","21313135")); // Do�ru giri�
	     
	     authService.login(new LoginDto("armagan.sahin95@gmail.com","2fdsfs35")); // Yanl�� �ifre ile giri�
	     
	     authService.login(new LoginDto("armagan.sin95@gmail.com","2fdsfs35")); // Yanl�� mail ile giri�
	     
	    
	     
	     
	}

}
