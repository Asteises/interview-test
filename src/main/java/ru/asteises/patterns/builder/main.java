package main.java.ru.asteises.patterns.builder;

public class main {
    public static void main(String[] args) {

        CarBuilder spb = new SportCarBuilder().setCarName("AUDI").setCarSpeed(150);

        Car car = spb.build();

        System.out.println(car);
    }
}
