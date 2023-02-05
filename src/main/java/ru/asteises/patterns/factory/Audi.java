package main.java.ru.asteises.patterns.factory;

public class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("speed 150");
    }

    @Override
    public void startup() {
        System.out.println("WRUUM!");
    }
}
