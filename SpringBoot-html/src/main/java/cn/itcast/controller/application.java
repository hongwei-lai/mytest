package cn.itcast.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class application {
	
	public static void main(String[] args) {
		
		SpringApplication application = new SpringApplication(application.class);
		
		application.run(args);
	}
	
}
