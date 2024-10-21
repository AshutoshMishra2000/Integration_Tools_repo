package com.example.SwaggerNew_project;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@OpenAPIDefinition(info = @io.swagger.v3.oas.annotations.info.Info(
		title = "Ashutosh Swagger Implementation",
		version = "1.0.0",
		description = "Api Documentation",
		contact = @Contact(
				name = "Ashutosh Mishra",
				email = "reply897@gmail.com",
				url = "https://www.example.com"
		)
))
@SpringBootApplication
public class SwaggerNewProjectApplication {
	public static void main(String[] args) {
		SpringApplication.run(SwaggerNewProjectApplication.class, args);
	}

}
