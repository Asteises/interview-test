package main.java.ru.asteises.patterns.builder.pizzeria;

import main.java.ru.asteises.patterns.builder.pizza.AbstractPizza;

public interface PizzaBuilder {

    PizzaBuilder setName(String name);
    PizzaBuilder setDough(String dough);
    PizzaBuilder setSauce(String sauce);
    PizzaBuilder setIngredients(String ingredients);
    PizzaBuilder setSize(Integer size);
    PizzaBuilder setPrice(Double price);

    AbstractPizza build();
}
