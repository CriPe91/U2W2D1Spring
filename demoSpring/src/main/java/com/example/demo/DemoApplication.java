package com.example.demo;


import com.example.demo.ConfigurationClass.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class DemoApplication {


	public static void main(String[] args) {


		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationBean.class);

		CartaMenù appMenu = appContext.getBean(CartaMenù.class);
		appMenu.stampaMenu();

		appContext.close();
	}

}
