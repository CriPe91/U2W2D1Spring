package com.example.demo.ConfigurationClass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class MenuPizzeria {
    private List<Pizza> pizze;
    private List<Toppings> toppings;
    private List<Drinks> drinks;
}

