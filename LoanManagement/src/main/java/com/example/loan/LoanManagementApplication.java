package com.example.loan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
	@OpenAPIDefinition (
			 info =@Info(
			 title = "Pharmacy",
			 version = "1.1.2",
			 description = "medicines",
			 contact = @Contact(
			name = "Janani",
			 email = "balu.b13056@gmail.com"
		    )
		    )
			)
public class LoanManagementApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(LoanManagementApplication.class, args);
	}

}
