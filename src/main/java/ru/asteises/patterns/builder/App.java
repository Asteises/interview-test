package main.java.ru.asteises.patterns.builder;

import main.java.ru.asteises.patterns.builder.pizza.AbstractPizza;
import main.java.ru.asteises.patterns.builder.pizza.ClientPizza;
import main.java.ru.asteises.patterns.builder.pizza.Margherita;

public class App {

    public static void main(String[] args) {

        AbstractPizza margherita = new Margherita()
                .setDough("tiny")
                .setSauce("red")
                .setIngredients("some ingredients")
                .setSize(40)
                .setPrice(10.0)
                .build();
        System.out.println(margherita);
        System.out.println("---");

        AbstractPizza pizza1 = new ClientPizza()
                .setName("")
                .setIngredients("some client ingredients")
                .setSauce("")
                .setSize(35)
                .build();
        System.out.println(pizza1);
    }
}
