package com.axsosacademy.exam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.axsosacademy.exam.models.Blog;
import com.axsosacademy.exam.models.User;
import com.axsosacademy.exam.services.BlogServices;
import com.axsosacademy.exam.services.UserService;


import jakarta.servlet.http.HttpSession;
@Controller
public class BlogController {
	private final BlogServices blogServices;
    private final UserService userService;
    
    public BlogController(BlogServices blogServices, UserService userService){
        this.blogServices = blogServices;
            this.userService = userService;
        }
    @RequestMapping("")
    public String showProjects(HttpSession session, Model model){
        if (session.getAttribute("id") == null) {
            return "redirect:/";
        }
        Long id = (Long) session.getAttribute("id");
        User currentUser = userService.findUserById(id);
        model.addAttribute("user", currentUser);
        model.addAttribute("availableblogs", blogServices.getAvailableProjects(currentUser));

        return "projects";
    }
    
    
    
	@RequestMapping("/create")
	public String createBlogPage(HttpSession session,Model model){
	    if (session.getAttribute("id") == null) {
	        return "redirect:/";
	    }
	    Long id = (Long) session.getAttribute("id");
	    model.addAttribute("user", UserService.findUserById(id));
	    model.addAttribute("projects",new Blog());
	        return "createproject";
}
}