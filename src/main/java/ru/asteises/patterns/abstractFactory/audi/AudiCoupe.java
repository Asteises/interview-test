package main.java.ru.asteises.patterns.abstractFactory.audi;

import main.java.ru.asteises.patterns.abstractFactory.standart.car.Car;
import main.java.ru.asteises.patterns.abstractFactory.standart.car.Coupe;

public class AudiCoupe extends Car implements Coupe {
    @Override
    public void makeDoors() {
        System.out.println("Doors ready");
    }

    @Override
    public void makeEngine() {
        System.out.println("Engine ready");
    }

    @Override
    public void makeTurbo() {
        System.out.println("Turbo ready");
    }
}
