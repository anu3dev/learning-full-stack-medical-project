package com.anu3dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}

/*
 * @component - spring will take care of object creation
 * 
 * @component and @bean
 * @controller and @RestController
 * @Service an d@repository
 * @Configuration 
 * 
 * 
 * @Override
 * 
 */