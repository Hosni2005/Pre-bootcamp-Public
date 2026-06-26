package com.firstProject.test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@GetMapping("/test")
	public String test() {
	    return "Home";
	}
	
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable String name) {
		return "Hello " + name ;
	}
	@GetMapping(path = "/login")
		public String login() {
		return "login page";
	}
		@GetMapping (path = "/contact")
		public String contact() {
			return "contact us page";
		}
		@GetMapping("/welcome")
		public String welcome(@RequestParam String name) {
		    return "Welcome " + name;
		}
		@GetMapping("/user")
		public User getUser() {
		    return new User("Hosni", 21);
		}
		@PostMapping("/user")
		public User createUser(@RequestBody User user) {
		    return user;
		}
}
		
		
		
