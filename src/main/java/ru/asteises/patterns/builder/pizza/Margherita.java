package main.java.ru.asteises.patterns.builder.pizza;

import main.java.ru.asteises.patterns.builder.pizzeria.PizzaBuilder;

public class Margherita extends AbstractPizza {

    @Override
    public PizzaBuilder setName(String name) {
        return this;
    }

    @Override
    public PizzaBuilder setDough(String dough) {
        this.dough = dough;
        return this;
    }

    @Override
    public PizzaBuilder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    @Override
    public PizzaBuilder setIngredients(String ingredients) {
        this.ingredients = ingredients;
        return this;
    }

    @Override
    public PizzaBuilder setSize(Integer size) {
        this.size = size;
        return this;
    }

    @Override
    public PizzaBuilder setPrice(Double price) {
        this.price = price;
        return this;
    }

    @Override
    public AbstractPizza build() {
        this.name = "Margherita";
        return this;
    }
}
