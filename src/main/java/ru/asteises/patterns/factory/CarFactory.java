package main.java.ru.asteises.patterns.factory;

public class CarFactory {

    public Car getCar(CarType carType) {

        Car car = null;

        switch (carType) {
            case BMW:
                car = new Bmw();
                break;
            case AUDI:
                car = new Audi();
                break;
        }
        car.drive();
        car.startup();
        return car;
    }
}
