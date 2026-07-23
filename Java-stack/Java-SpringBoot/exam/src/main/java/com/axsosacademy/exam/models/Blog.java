package com.axsosacademy.exam.models;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "blogs")
public class Blog {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 2,max = 30 , message = "fill the project name")
    private String blogTitle;
    @NotNull(message = "Due date is required")
    @Future(message = "please enter a valid date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dueDate;


	@Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createdAt;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updatedAt;

    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user ;

    public Blog(){
    	
    }
    
    

    public Blog(Long id,
			@NotNull @Size(min = 2, max = 30, message = "fill the project name") String blogTitle,
			@NotNull(message = "Due date is required") @Future(message = "please enter a valid date") LocalDate dueDate,
			User user) {
		super(); 
		this.id = id;
		this.blogTitle = blogTitle;
		this.dueDate = dueDate;
		this.user = user;
	}

	@PrePersist
    protected void onCreate(){
        this.createdAt=new Date();
    }
    public User getTeamLeader() {
		return user;
	}

	public void setTeamLeader(User teamLeader) {
		this.user = teamLeader;
	}

	@PreUpdate
    protected void onUpdate(){
        this.updatedAt=new Date();
    }

    public Date getCreatedAt() {
    	return createdAt;
    }
    
    public void setCreatedAt(Date createdAt) {
    	this.createdAt = createdAt;
    }
    
    public Date getUpdatedAt() {
    	return updatedAt;
    }
    
    public void setUpdatedAt(Date updatedAt) {
    	this.updatedAt = updatedAt;
    }

	public Long getid() {
		return id;
	}

	public void setid(Long id) {
		this.id = id;
	}

	public String getblogTitle() {
		return blogTitle;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}
	
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public void setblogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}



	public void setfirstName(String firstName) {
		// TODO Auto-generated method stub
		
	}

	
   
}
