package com.example.demo.Model;


import lombok.*;

@NoArgsConstructor
@Getter


public class PizzasXL extends Pizzas {
    private static final double prezzoXL = 2.5;
    private static final int calorieAggiuntiveXL = 180;

    public PizzasXL(String nome, int calorie, double prezzoBase) {
        super(nome, calorie + calorieAggiuntiveXL, prezzoBase + prezzoXL);
    }

    @Override
    public String toString() {
        return "PizzasXL{" +
                "nome='" + nome + '\''+
        ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
