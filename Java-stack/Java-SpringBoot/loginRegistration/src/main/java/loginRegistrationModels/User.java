package loginRegistrationModels;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "user")
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;



@NotNull(message="Username is required")
@Size(min=3,message="Username must be at least 3 characters")
@Pattern(
regexp="^[a-zA-Z]+$",
message="Username must contain letters only"
)
private String username;



@NotNull(message="Email is required")
@Email(message="Invalid email")
@Column(unique=true)
private String email;



@NotNull(message="Password is required")
@Size(min=8,message="Password must be 8 characters minimum")
@Pattern(
regexp="^(?=.*[A-Z])(?=.*[0-9]).*$",
message="Password must contain uppercase and number"
)
private String password;



@Transient
@NotNull(message="Confirm password required")
private String confirmPassword;



@NotNull(message="Birthday required")
@Past(message="Birthday must be in the past")
private LocalDate birthday;



private String gender;



private String country;



@ElementCollection
private List<String> languages;



// getters setters


public Long getId(){
return id;
}


public void setId(Long id){
this.id=id;
}


public String getUsername(){
return username;
}


public void setUsername(String username){
this.username=username;
}


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


public String getConfirmPassword(){
return confirmPassword;
}


public void setConfirmPassword(String confirmPassword){
this.confirmPassword=confirmPassword;
}


public LocalDate getBirthday(){
return birthday;
}


public void setBirthday(LocalDate birthday){
this.birthday=birthday;
}


public String getGender(){
return gender;
}


public void setGender(String gender){
this.gender=gender;
}


public String getCountry(){
return country;
}


public void setCountry(String country){
this.country=country;
}


public List<String> getLanguages(){
return languages;
}


public void setLanguages(List<String> languages){
this.languages=languages;
}

}
