package main.java.ru.asteises.patterns.propertyContainer;

public abstract class AbstractMovie extends PropertyContainerImpl {

    private int id;
    private String name;
    private String country;

    public AbstractMovie(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
    }
}
