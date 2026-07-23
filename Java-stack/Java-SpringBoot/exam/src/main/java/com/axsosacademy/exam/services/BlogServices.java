package com.axsosacademy.exam.services;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.axsosacademy.exam.models.Blog;
import com.axsosacademy.exam.models.User;
import com.axsosacademy.exam.repositores.BlogRepository;

@Service
public class BlogServices {
private final BlogRepository blogRepo;

public BlogServices(BlogRepo blogRepo){
    this.blogRepo = blogRepo;
}
 public List<Blog> getAllProjects(){
    return blogRepo.findAll();
 }
 public Blog getSingleProjectById(Long project_id){
     Optional<Blog> optionalProject = blogRepo.findById(project_id);
     if(optionalProject.isPresent()){
             return optionalProject.get();
     }
     return null;

 }
 public void createCallProject(Blog blog){

    blogRepo.save(blog);
 }
 public void deleteCallProject(Long project_id){
    blogRepo.deleteById(project_id);
 }
 public Blog updateCallProject(Long blog_id, String blogTitle, String createdAt, String description,Date createdAt , String firstName){
    Blog blog = getSingleProjectById(blog_id);
    blog.setblogTitle(blogTitle);
    blog.setfirstName(firstName);
    blog.setCreatedAt(createdAt);
    
    
    return blogRepo.save(blog);
 }
 


    
    // All projects EXCLUDING the ones the logged-in user created.
    public List<Blog> getAvailableProjects(User currentUser){
        return blogRepo.findByUserNot(currentUser);
    }

    // Projects the logged-in user created themselves.
    public List<Blog> getMyProjects(User currentUser){
        return blogRepo.findByUser(currentUser);
    }






}
