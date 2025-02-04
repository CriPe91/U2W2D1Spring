package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Run...");

//		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(DemoApplication.class);
//		appContext.close();

	}

}
