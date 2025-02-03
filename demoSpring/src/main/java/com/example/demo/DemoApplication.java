package com.example.demo;

import com.example.demo.ConfigurationClass.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);



		//Creo un contenitore
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(ConfigurationBean.class);

		// Recupero il Bean con i paramentri tramite la classe ConfigurationBean
		Pizza margherita = (Pizza) appContext.getBean("margherita","Margherita",1104,4.99);
		Pizza hawaiian = (Pizza) appContext.getBean("hawaiian","Hawaiian",10244,6.49);
		Pizza salami = (Pizza) appContext.getBean("salami","Salami",10244,6.49);

		Toppings formaggio = (Toppings) appContext.getBean("formaggio","Formaggio",92,0.69);
		Toppings prosciutto = (Toppings) appContext.getBean("prosciutto","Prosciutto",35,0.89);
		Toppings cipolla = (Toppings) appContext.getBean("cipolla","Cipolla",25,0.99);
		Toppings ananas = (Toppings) appContext.getBean("ananas","Ananas",22,0.69);
		Toppings salame = (Toppings) appContext.getBean("salame","Salame",82,0.89);

		Drinks limonata = (Drinks) appContext.getBean("limonata","Limonata",128,1.29);
		Drinks acqua = (Drinks) appContext.getBean("acqua","Acqua",128,1.29);
		Drinks vino = (Drinks) appContext.getBean("vino","Vino",128,1.29);


		//MENU
		//PIZZE
		System.out.println("Lista Pizze :");
		System.out.println(margherita);
		System.out.println(hawaiian);
		System.out.println(salami);
        //TOPPINGS
		System.out.println("Lista Toppings :");
		System.out.println(formaggio);
		System.out.println(prosciutto);
		System.out.println(cipolla);
		System.out.println(ananas);
		System.out.println(salame);
		//BEVANDE
		System.out.println("Lista Bevande :");
		System.out.println(limonata);
		System.out.println(acqua);
		System.out.println(vino);

		System.out.println("BUON APPETITO!!!");

		// Chiudo in Container
		appContext.close();
	}

}
