package com.axsosacademy.models;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "comments")
public class Comment {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 @NotNull(message= "Comment cannot be empty")
	 @Column(length = 700)
	 private String content ;
	 
	 @Column(updatable = false)
	 private Date createdAt;
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name="user_id")
	 private User user;
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "blog_id")
	    private Blog blog;
	 public Comment() {
	    }
	 @PrePersist
	    protected void onCreate() {
	        this.createdAt = new Date();
	    }
	 public Comment(Long id, @NotNull(message = "Comment cannot be empty") String content, Date createdAt, User user,
			Blog blog) {
		super();
		this.id = id;
		this.content = content;
		this.createdAt = createdAt;
		this.user = user;
		this.blog = blog;
	 }
	 public Long getId() {
		 return id;
	 }
	 public void setId(Long id) {
		 this.id = id;
	 }
	 public String getContent() {
		 return content;
	 }
	 public void setContent(String content) {
		 this.content = content;
	 }
	 public Date getCreatedAt() {
		 return createdAt;
	 }
	 public void setCreatedAt(Date createdAt) {
		 this.createdAt = createdAt;
	 }
	 public User getUser() {
		 return user;
	 }
	 public void setUser(User user) {
		 this.user = user;
	 }
	 public Blog getBlog() {
		 return blog;
	 }
	 public void setBlog(Blog blog) {
		 this.blog = blog;
	 }
	 
	 
	 
}
