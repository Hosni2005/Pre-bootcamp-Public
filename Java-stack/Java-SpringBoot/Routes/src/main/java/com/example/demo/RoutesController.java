package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/daikichi")
public class RoutesController {	
	@GetMapping ("/{name}")
	public String Welcome(@PathVariable String name) {
		return "Welcome " + name ;
	}
	
	@GetMapping ("/today")
	public String Today() {
		return "Today you will find luck in all your endeavors!";
	}
	@GetMapping ("tomorrow")
	public String Tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
}
