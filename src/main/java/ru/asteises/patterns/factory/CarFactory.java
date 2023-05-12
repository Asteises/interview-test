package main.java.ru.asteises.patterns.factory;

public class CarFactory {

    public Car getCar(CarType carType) {

        Car car = switch (carType) {
            case BMW -> new Bmw();
            case AUDI -> new Audi();
        };

        car.drive();
        car.startup();
        return car;
    }
}
