package main.java.ru.asteises.patterns.abstractFactory.standart.factory;

import main.java.ru.asteises.patterns.abstractFactory.standart.car.Coupe;
import main.java.ru.asteises.patterns.abstractFactory.standart.car.Sedan;

public interface CarsFactory {

    Sedan createSedan();

    Coupe createCoupe();
}
