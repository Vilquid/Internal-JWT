package ku.product.service;
import ku.product.dto.LoginDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private JwtService jwtService;
	public String login(LoginDto loginDto) {
		UsernamePasswordAuthenticationToken pwdToken =
				new UsernamePasswordAuthenticationToken(
						loginDto.getUsername(),
						loginDto.getPassword());
		Authentication authentication =
				authenticationManager.authenticate(pwdToken);
		SecurityContextHolder.getContext().setAuthentication(authentication);
		return jwtService.generateToken(authentication);
	}
}