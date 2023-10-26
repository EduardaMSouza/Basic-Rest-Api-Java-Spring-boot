package com.souza.demo;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
		title = "Spring Boot Restful Api Documentation",
		description = "Spring Boot Restful Api Documentation",
		version = "v1.0",
		contact = @Contact(
				name = "Eduarda Souza",
				email = "Eduarda@gmail.com"
		),
		license = @License(
				name = "Apache 2.0",
				url = "http://www.javaguides.net/license"
		)
),
		externalDocs = @ExternalDocumentation(
				description = "Spring Boot Management Documentation")
)
public class DemoApplication {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
