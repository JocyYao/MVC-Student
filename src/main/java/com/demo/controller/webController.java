package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class webController {
	
	@GetMapping("main")
	public String main() {
		System.out.println("Main"); 
		//model.addAttribute("message", "Hello World");
		return "main.jsp";
	}
	@GetMapping("/welcome")
	public String welcome() {
		System.out.println("Hi"); 
		//model.addAttribute("message", "Hello World");
		return "welcome.jsp";
	}
	
	
	
}
