package com.firstProject.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HtmlController {

    @GetMapping("/")
    public String home() {
        return "home";
    }
    @PostMapping ("/login")
    public String login(
    		@RequestParam String name , 
    		@RequestParam String email ,
    		@RequestParam String password ,
    		Model model ) {
    	System.out.println("Name :" + name);
    	System.out.println("Email :" + email);
    	System.out.println("password :" + password);
    	model.addAttribute("name", name);
        model.addAttribute("email", email);
        model.addAttribute("password", password);
    	return "success" ;
    }
    
}