package com.main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String redirect(Model model) {
		return "redirect:/home";
	}
	
	
	@GetMapping("/home")
	public String getHome(Model model) {
		model.addAttribute("home", new Entity());
		return "home";
	}

}
