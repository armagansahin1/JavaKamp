package business.validationTools.Regex;

import business.validationTools.Validation;

import core.validations.Regex.RegexValidation;
import core.entities.dtos.RegisterDto;

public class AuthValidator implements Validation<RegisterDto>{


	public  boolean validate(RegisterDto registerDto) {
	    
		if(!RegexValidation.emailValidate(registerDto.getEmail())  ||  
				!RegexValidation.characterLengthValidate(2, 15, registerDto.getFirstName())
				|| !RegexValidation.characterLengthValidate(2, 15, registerDto.getLastName())
			||	!RegexValidation.passwordValidate(6, 12, registerDto.getPassword())) {
			
			return false;
			
		}
		
		return true;
		
	}
}
