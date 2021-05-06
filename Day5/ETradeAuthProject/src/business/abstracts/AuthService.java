package business.abstracts;

import core.entities.dtos.LoginDto;
import core.entities.dtos.RegisterDto;

public interface AuthService {

	void login(LoginDto loginDto);
	void register(RegisterDto registerDto);
}
