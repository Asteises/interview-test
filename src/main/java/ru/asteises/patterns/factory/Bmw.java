package main.java.ru.asteises.patterns.factory;

public class Bmw implements Car {

    @Override
    public void drive() {
        System.out.println("speed 100");
    }

    @Override
    public void startup() {
        System.out.println("DRRR!");
    }
}
