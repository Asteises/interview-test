package main.java.ru.asteises.patterns.abstractFactory.audi;

import main.java.ru.asteises.patterns.abstractFactory.standart.factory.CarsFactory;
import main.java.ru.asteises.patterns.abstractFactory.standart.car.Coupe;
import main.java.ru.asteises.patterns.abstractFactory.standart.car.Sedan;

public class AudiFactory implements CarsFactory {

    @Override
    public Sedan createSedan() {
        return new AudiSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new AudiCoupe();
    }
}
