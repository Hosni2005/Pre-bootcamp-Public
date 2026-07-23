package com.axsosacademy.exam.models;


import java.util.List;



import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


@Entity
@Table(name= "users")
public class User {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    // Username - letters only, at least 3 characters, not blank
	    @NotEmpty(message = "First name is required!")
	    @Pattern(regexp = "^[A-Za-z]+$", message = "First name must contain letters only!")
	    @Size(min = 8, max = 30, message = "First name must be between 8 and 30 characters")
	    private String firstName;
	    
	    @NotEmpty(message = "Last name is required!")
	    @Pattern(regexp = "^[A-Za-z]+$", message = "Last name must contain letters only!")
	    @Size(min = 8, max = 30, message = "Last name must be between 8 and 30 characters")
	    private String lastName;

	    // Email - valid Email format, not blank
	    // (checking that it does not already exist in the database
	    //  happens in the service, because it needs a database query)
	    @NotEmpty(message = "Email is required!")
	    @Email(message = "Please enter a valid email!")
	    private String email;

	    // Password - at least 8 characters, not blank
	    @NotEmpty(message = "Password is required!")
	    @Size(min = 8, max = 128, message = "Password must be between 8 and 128 characters")
	    @Pattern(regexp = "^(?=.*[A-Z])(?=.*[0-9]).+$",message = "Password sould contine an upper case numbers")
	    private String password;

	    // @Transient: this field is NOT stored in the database.
	    // When saving a User with a JPA method, all transient fields are ignored,
	    // and only the persistent fields are stored in the database.
	    // We only use it temporarily to compare it against the password.
	    @Transient
	    @NotEmpty(message = "Confirm Password is required!")
	    @Size(min = 8, max = 128, message = "Confirm Password must be between 8 and 128 characters")
	    private String confirm;

	    
	    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
	    private List<Blog> blog;

	    public User(List<Blog> blog) {
			
			this.blog = blog;
		}


	    // Empty constructor required by JPA
	    public User() {
	    }

	    public User(Long id, String email, String password, String confirm, 
	                String firstName, String lastName) {
	        this.id = id;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.email = email;
	        this.password = password;
	        this.confirm = confirm;

	    }

	   
		public List<Blog> getBlog() {
			return blog;
		}


		public void setBlog(List<Blog> blog) {
			this.blog = blog;
		}


		// ----- getters and setters -----
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    

	    public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getConfirm() {
	        return confirm;
	    }

	    public void setConfirm(String confirm) {
	        this.confirm = confirm;
	    }

	    
}
