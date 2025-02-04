package com.example.demo.ConfigurationClass;

import com.example.demo.Model.*;
import com.example.demo.StatoOrdine;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
@PropertySource("application.properties")
public class ConfigurationBean {

    @Value("${coperto}") private double coperto;

        @Bean
        @Scope("prototype")
        public Toppings prosciutto() {
            return new Toppings("prosciutto", 35, 0.99);
        }

        @Bean
        @Scope("prototype")
        public Toppings ananas() {
            return new Toppings("ananas", 24, 0.79);
        }

        @Bean
        @Scope("prototype")
        public Toppings funghi() {
            return new Toppings("funghi", 72, 1.29);
        }

        @Bean
        @Scope("prototype")
        public Toppings salame() {
            return new Toppings("salame", 86, 0.99);
        }

        @Bean
        @Scope("prototype")
        public Toppings formaggio() {
            return new Toppings("formaggio", 92, 0.75);
        }

        @Bean
        @Scope("prototype")
        public Toppings cipolla() {
            return new Toppings("cipolla", 22, 0.57);
        }

        @Bean
        @Scope("prototype")
        public Pizzas margherita() {
            Pizzas pizza = new Pizzas("Margherita", 1089, 6.0);
            return pizza;
        }

        @Bean
        @Scope("prototype")
        public Pizzas napoletana() {
            Pizzas pizza = new Pizzas("Napoletana", 1320, 7.0);
            return pizza;
        }

        @Bean
        @Scope("prototype")
        public PizzasXL margheritaXl() {
            return new PizzasXL("margherita XL", 1155, 6.0);
        }

        @Bean
        @Scope("prototype")
        public Pizzas napoletanaXl() {
            return new PizzasXL("napoletana XL", 1450, 7.0);
        }

        @Bean
        @Scope("prototype")
        public Drinks cocaCola() {
            return new Drinks("Coca-Cola", 172, 2.5);
        }

        @Bean
        @Scope("prototype")
        public Drinks acqua() {
            return new Drinks("Acqua", 0, 1.0);
        }

        @Bean
        @Scope("prototype")
        public Tavolo tavolo1(){
            return new Tavolo(1,4,false);
        }

    @Bean
    @Scope("prototype")
    public Tavolo tavolo2(){
        return new Tavolo(2,2,false);
    }

    @Bean
    @Scope("prototype")
    public Tavolo tavolo3(){
        return new Tavolo(3,6,true);
    }

    @Bean
    @Scope("prototype")
    public Tavolo tavolo4(){
        return new Tavolo(4,5,true);
    }

    @Bean
    @Scope("prototype")
    public Ordine ordine1(){
        return new Ordine(1,, StatoOrdine.IN_CORSO,4,)
    }

    @Bean
        public CartaMenù menu() {
            return new CartaMenù(List.of(margherita(), napoletana(), margheritaXl(), napoletanaXl()), List.of(cocaCola(), acqua()), List.of(salame(), ananas(), cipolla(), formaggio(), funghi(), prosciutto()));
        }
    }


