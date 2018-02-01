package cn.laidashuai.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@Resource
	private Environment environment;
	
	@Value("${name}")
	private String name;
	
	@Value("${url}")
	private String url;
	
	@GetMapping("/hello")
//	@PostMapping("/hello")
	public String hello() {
		
		System.out.println(environment.getProperty("name"));
		System.out.println(environment.getProperty("url"));
		System.out.println("----------------------------------");
		System.out.println(name);
		System.out.println(url);
		
		return "hello SpringBoot888!!";
	}
}
