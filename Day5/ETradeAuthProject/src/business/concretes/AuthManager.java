package business.concretes;

import business.abstracts.AuthService;
import business.abstracts.UserService;
import business.validationTools.Validation;
import core.accountServices.AccountService;
import core.entities.dtos.LoginDto;
import core.entities.dtos.RegisterDto;
import entities.concretes.User;


public class AuthManager implements AuthService{

	UserService userService;
    Validation<RegisterDto> validation;
    AccountService accountService;
	public AuthManager(UserService userService, Validation<RegisterDto> validation,AccountService accountService) {
		
		this.userService = userService;	
		this.validation=validation;
		this.accountService=accountService;
	}

	@Override
	public void login(LoginDto loginDto) {
		
	   var user = this.userService.getByMail(loginDto.getEmail());
	   if(user==null) {
		   System.out.println("Email adresi bulunamadý");
		   return;
	   }
	   if(user.password != loginDto.getPassword()) {
		   System.out.println("Hatalý þifre girdiniz !!!");
		   return;
	   }
	   System.out.println("Baþarýyla giriþ yapýldý");
	   
	}

	@Override
	public void register(RegisterDto registerDto) {
		
		if(this.userService.getByMail(registerDto.getEmail()) != null) {
			System.out.println("Girdiðiniz e-mail adresine kayýtlý baþka bir kullanýcý bulunmaktadýr");
			return;
		}
		if(!validation.validate(registerDto)) {
			System.out.println("Hatalý giriþ yapýnýz");
			return;
		}
		if(!accountService.validate(registerDto.getEmail())) {
			System.out.println("Lütfen gmail uzantýlý email adresinizi giriniz");
			return;
		}
		System.out.println("Baþarýyla kayýt olundu");
		var userToAdd = new User(0,registerDto.getFirstName(),registerDto.getLastName(),registerDto.getEmail(),registerDto.getPassword());
		 this.userService.add(userToAdd);
		
	}

}
