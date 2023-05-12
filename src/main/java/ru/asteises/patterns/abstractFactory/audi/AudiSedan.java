package main.java.ru.asteises.patterns.abstractFactory.audi;

import main.java.ru.asteises.patterns.abstractFactory.standart.car.Car;
import main.java.ru.asteises.patterns.abstractFactory.standart.car.Sedan;

public class AudiSedan extends Car implements Sedan {
    @Override
    public void makeDoors() {
    }

    @Override
    public void makeEngine() {
    }

    @Override
    public void makeSeats() {
    }
}
