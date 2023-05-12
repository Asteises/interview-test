package main.java.ru.asteises.patterns.builder;

public class main {
    public static void main(String[] args) {

        CarBuilder scb = new SportCarBuilder().setCarName("AUDI").setCarSpeed(150);

        Car car = scb.build();

        System.out.println(car);
    }
}
