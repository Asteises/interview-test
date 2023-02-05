package main.java.ru.asteises.patterns.factory;

public class Main {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        carFactory.getCar(CarType.AUDI);
        carFactory.getCar(CarType.BMW);
    }
}
