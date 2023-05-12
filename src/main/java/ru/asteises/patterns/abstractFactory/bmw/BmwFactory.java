package main.java.ru.asteises.patterns.abstractFactory.bmw;

import main.java.ru.asteises.patterns.abstractFactory.standart.factory.CarsFactory;
import main.java.ru.asteises.patterns.abstractFactory.standart.car.Coupe;
import main.java.ru.asteises.patterns.abstractFactory.standart.car.Sedan;

public class BmwFactory implements CarsFactory {

    @Override
    public Sedan createSedan() {
        return new BmwSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new BmwCoupe();
    }
}
