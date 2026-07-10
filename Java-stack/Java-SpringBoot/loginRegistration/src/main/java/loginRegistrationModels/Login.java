package loginRegistrationModels;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class Login {
	@NotNull(message="Email required")
	@Email(message="Invalid email")
	private String email;


	@NotNull(message="Password required")
	private String password;



	public String getEmail(){
	return email;
	}


	public void setEmail(String email){
	this.email=email;
	}


	public String getPassword(){
	return password;
	}


	public void setPassword(String password){
	this.password=password;
	}
}
