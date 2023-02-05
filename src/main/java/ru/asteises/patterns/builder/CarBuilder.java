package main.java.ru.asteises.patterns.builder;

public interface CarBuilder {

    CarBuilder setCarName(String name);
    CarBuilder setCarSpeed(Integer speed);
    CarBuilder setCarHorsePower(Integer horsePower);

    Car build();
}
