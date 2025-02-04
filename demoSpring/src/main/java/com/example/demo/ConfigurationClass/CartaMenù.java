package com.example.demo.ConfigurationClass;

import com.example.demo.Model.Drinks;
import com.example.demo.Model.Pizzas;
import com.example.demo.Model.Toppings;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class CartaMenù {

    private List<Pizzas> pizze;
    private List<Drinks> bevande;
    private List<Toppings> toppings;



    public void stampaMenu() {
        System.out.println("Menù Pizzeria:");

        System.out.println("\nPizzas:");
        for (Pizzas pizza : pizze) {
            System.out.println(pizza);
        }

        System.out.println("\nToppings");
        for (Toppings topping : toppings) {
            System.out.println(topping);
        }

        System.out.println("\nDrinks:");
        for (Drinks drink : bevande) {
            System.out.println(drink);
        }
    }
}
