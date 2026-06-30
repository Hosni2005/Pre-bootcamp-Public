package com.axsosacademy.hellohuman;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {
	@GetMapping("")
	public String Greeting() {
		return "Hello Human";
	}
	@GetMapping("/")
	public String Name(@RequestParam String name) {
		return "Hello " + name ;
	}
}
