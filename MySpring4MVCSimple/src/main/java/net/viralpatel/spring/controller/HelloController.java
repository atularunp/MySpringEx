package net.viralpatel.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/hello")
	public String hello(Model model) {

		model.addAttribute("name", "John Doe");

		return "welcome";
	}
	
	@GetMapping("/helloMap")
	public String helloModelMap(ModelMap modelmap) {
       //ModelMap is linked hash map storage 
		modelmap.addAttribute("city", "Pune############");
		modelmap.addAttribute("address", "BanerRoad###########");
		return "welcomeMap";
	}
	
	
	
	
	
}
