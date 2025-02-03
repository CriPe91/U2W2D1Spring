package com.example.demo.ConfigurationClass;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigurationBean {

    @Bean
    @Scope("prototype")
    public Pizza margherita(String nome,int calorie,double prezzo){
        return new Pizza(nome,calorie,prezzo);
    }

    @Bean
    @Scope("prototype")
    public Pizza hawaiian(String nome,int calorie,double prezzo){
        return new Pizza(nome,calorie,prezzo);
    }

    @Bean
    @Scope("prototype")
    public Pizza salami(String nome,int calorie,double prezzo){
        return new Pizza(nome,calorie,prezzo);
    }

    @Bean
    @Scope("prototype")
    public Toppings formaggio(String nome,int calorie,double prezzo){
        return new Toppings(nome,calorie,prezzo);
    }

    @Bean
    @Scope("prototype")
    public Toppings prosciutto(String nome,int calorie,double prezzo){
        return new Toppings(nome,calorie,prezzo);
    }

    @Bean
    @Scope("prototype")
    public Toppings cipolla(String nome,int calorie,double prezzo){
        return new Toppings(nome,calorie,prezzo);
    }

    @Bean
    @Scope("prototype")
    public Toppings ananas(String nome,int calorie,double prezzo){
        return new Toppings(nome,calorie,prezzo);
    }

    @Bean
    @Scope("prototype")
    public Toppings salame(String nome,int calorie,double prezzo){
        return new Toppings(nome,calorie,prezzo);
    }

    @Bean
    @Scope("prototype")
    public Drinks limonata(String nome,int calorie,double prezzo){
        return new Drinks(nome,calorie,prezzo);
    }

    @Bean
    @Scope("prototype")
    public Drinks acqua(String nome,int calorie,double prezzo){
        return new Drinks(nome,calorie,prezzo);
    }

    @Bean
    @Scope("prototype")
    public Drinks vino(String nome,int calorie,double prezzo){
        return new Drinks(nome,calorie,prezzo);
    }


}
