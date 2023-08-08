package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ={"com."})
public class PatientsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientsServiceApplication.class, args);
	}

}
