package main.java.ru.asteises.patterns.builder.pizza;

import main.java.ru.asteises.patterns.builder.pizzeria.PizzaBuilder;

public abstract class AbstractPizza implements PizzaBuilder {

    protected String name;
    protected String dough;
    protected String sauce;
    protected String ingredients;
    protected Integer size;
    protected Double price;

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", size=" + size +
                ", price=" + price +
                '}';
    }
}
