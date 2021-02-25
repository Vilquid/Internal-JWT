package ku.product.controller;
import ku.product.dto.LoginDto;
import ku.product.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController
{
	private AuthenticationService authService;
	
	@PostMapping("/login")
	public String login(@RequestBody LoginDto loginDto)
	{
		return authService.login(loginDto);
	}
}