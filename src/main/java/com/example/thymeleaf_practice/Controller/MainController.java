package com.example.thymeleaf_practice.Controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	// http://localhost:8080/index
	@RequestMapping(value = "/index" , method = RequestMethod.GET	)
	public String index(Model modal) {
		modal.addAttribute("name","Shubham Nigam");
		modal.addAttribute("date", new Date());
		return "index";
	}
}
