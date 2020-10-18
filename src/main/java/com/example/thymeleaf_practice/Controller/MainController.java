package com.example.thymeleaf_practice.Controller;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	// http://localhost:8080/index
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String index(Model modal) {
		modal.addAttribute("name", "Shubham Nigam");
		modal.addAttribute("date", new Date());
		return "index";
	}

	// Handling Iteration
	@GetMapping("/iterate")
	public String iterateHandler(Model model) {
		List<String> list = List.of("Sakshi", "Shubham", "Shubhanshu");
		model.addAttribute("friends", list);
		return "iterate";
	}

	// Handler for conditional statements
	@GetMapping("/condition")
	public String conditionalHandler(Model model) {
		model.addAttribute("state", true);
		model.addAttribute("gender", "F");
		List<Integer> list = List.of(123, 234, 345, 456);
		model.addAttribute("mylist", list);
		return "condition";
	}

	// Handler for including fragments
	@GetMapping("/service")
	public String service(Model model) {
		model.addAttribute("title", "This is title ....");
		model.addAttribute("subtitle","This is subtitle ...");	
		return "service";
	}
	@GetMapping("/newabout")
	public String newAbout() {
		return "aboutnew";
	}

}
