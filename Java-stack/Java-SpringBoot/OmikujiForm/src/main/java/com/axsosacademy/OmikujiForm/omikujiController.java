package com.axsosacademy.OmikujiForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class omikujiController {

	@GetMapping("/omikuji")
	public String index() {
		return "index";
	}
	@PostMapping("/omikuji/process")
	public String process(
		@RequestParam("number") String number, 
		@RequestParam("city") String city ,
		@RequestParam("person") String person ,
		@RequestParam("hobby") String hobby ,
		@RequestParam("livingThing") String livingThing ,
		 @RequestParam("nice") String nice,
		HttpSession session
		
		) {
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("livingThing", livingThing);
		session.setAttribute("nice", nice);
		
		return "redirect:/omikuji/show";
	}
	
	@GetMapping("/omikuji/show")
	public String show(HttpSession session , Model model) {
		model.addAttribute("number" , session.getAttribute("number"));
		model.addAttribute("city", session.getAttribute("city"));
        model.addAttribute("person", session.getAttribute("person"));
        model.addAttribute("hobby", session.getAttribute("hobby"));
        model.addAttribute("livingThing", session.getAttribute("livingThing"));
        model.addAttribute("nice", session.getAttribute("nice"));
        return "show";
	}
	
	
	
}
