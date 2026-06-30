package com.axsosacademy.counter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {
	@RequestMapping("/")
	public String counterDisplay(HttpSession session , Model model) {
		 
		Integer count = (Integer) session.getAttribute("count");

        if (count == null) {
            count = 1;
        } else {
            count++;
        }

        session.setAttribute("count", count);
		
		
		return "index";
	}
	
	 @GetMapping("/counter")
	    public String counter(HttpSession session, Model model) {

	        Integer count = (Integer) session.getAttribute("count");

	        if (count == null) {
	            count = 0;
	        }

	        model.addAttribute("count", count);

	        return "counter";
	    }

	   

	
}
