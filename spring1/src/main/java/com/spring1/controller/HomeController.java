package com.spring1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("home")
public class HomeController {
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("title","HIHIHI");
		
		return "index";
	}

}
