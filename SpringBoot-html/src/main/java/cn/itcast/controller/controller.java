package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
		
	@GetMapping("/show")
	public String showHtml() {
		return "user.html";
	}
	
}
