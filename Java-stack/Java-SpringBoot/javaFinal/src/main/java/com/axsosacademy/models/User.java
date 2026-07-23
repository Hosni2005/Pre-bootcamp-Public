package com.axsosacademy.models;

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
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
//The actual table name in MySQL is "users"
@Table(name = "users")
public class User {
	 // Primary key, auto-incremented by MySQL
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // First name - at least 8 characters, not blank (per wireframe validation notes)
    @NotNull(message = "First name is required!")
    @Size(min = 8, max = 60, message = "First name must be at least 8 characters")
    private String firstName;

    // Last name - at least 8 characters, not blank
    @NotNull(message = "Last name is required!")
    @Size(min = 8, max = 60, message = "Last name must be at least 8 characters")
    private String lastName;

    // Email - valid Email format, not blank
    // (uniqueness is checked in the service, since that needs a database query)
    @NotNull(message = "Email is required!")
    @Email(message = "Please enter a valid email!")
    private String email;

    // Password - at least 8 characters, not blank
    @NotNull(message = "Password is required!")
    @Size(min = 8, max = 128, message = "Password must be at least 8 characters")
    private String password;

    // @Transient: this field is NOT stored in the database.
    // We only use it temporarily to compare it against the password.
    @Transient
    @NotNull(message = "Confirm Password is required!")
    private String confirm;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Blog> blogs;

    // Empty constructor required by JPA
    public User() {
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

    public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }
}
