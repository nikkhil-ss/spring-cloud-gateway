package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ={"com."})
public class DisesesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DisesesServiceApplication.class, args);
	}

}
