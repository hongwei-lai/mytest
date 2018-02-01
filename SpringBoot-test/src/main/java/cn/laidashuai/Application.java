package cn.laidashuai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot的引导类
 * @author laidashuai
 *
 */
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		//SpringApplication.run(Application.class, args);
		
		SpringApplication application = new SpringApplication(Application.class);
		application.run(args);
		
	
	}

}
