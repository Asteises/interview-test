package main.java.ru.asteises.patterns.proxyPattern;

public class App {

    public static void main(String[] args) {

        CarFactory carFactory = new ProxyCarFactory();

        carFactory.createCar();
    }
}
