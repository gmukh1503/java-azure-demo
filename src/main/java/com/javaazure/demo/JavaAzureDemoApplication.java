package com.javaazure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaAzureDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaAzureDemoApplication.class, args);
	}

	@GetMapping("/message")
	public String getMessage() {
		return "Congratulations..!! Your application is deployed and running in Azure AppService.";
	}
}
