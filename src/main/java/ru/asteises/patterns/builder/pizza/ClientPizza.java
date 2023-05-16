package main.java.ru.asteises.patterns.builder.pizza;

import main.java.ru.asteises.patterns.builder.pizzeria.PizzaBuilder;

public class ClientPizza extends AbstractPizza {

    @Override
    public PizzaBuilder setName(String name) {
        this.name = name;
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
        return this;
    }

    @Override
    public AbstractPizza build() {
        if (name == null || name.isEmpty()) {
            this.name = "Client pizza";
        }
        if (dough == null || dough.isBlank()) {
            this.dough = "tiny";
        }
        if (sauce == null || sauce.isBlank()) {
            this.sauce = "classic pizza sauce";
        }
        if (ingredients == null || ingredients.isBlank()) {
            throw new RuntimeException("We cant do pizza without ingredients");
        }
        if (size == null) {
            this.size = 40;
        }
        this.price = 20.0;
        return this;
    }
}
