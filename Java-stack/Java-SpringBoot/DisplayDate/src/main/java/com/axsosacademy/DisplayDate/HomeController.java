package com.axsosacademy.DisplayDate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
@GetMapping("/")
public String index() {
	return "index";
}

@GetMapping("/date")
public String date(Model model) {
	Date date = new Date();
	
	 SimpleDateFormat formatter =
             new SimpleDateFormat("EEEE, 'the' d 'of' MMMM, yyyy");
	 model.addAttribute("date" , formatter.format(date));
	 return "date";
}

@GetMapping("/time")
public String time(Model model) {
	Date date = new Date();
	SimpleDateFormat formatter = 
			new SimpleDateFormat("hh:mm a");
	model.addAttribute("time", formatter.format(date));
	return "time";
	
}

}
