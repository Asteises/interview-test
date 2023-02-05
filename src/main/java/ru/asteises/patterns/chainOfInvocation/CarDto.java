package main.java.ru.asteises.patterns.chainOfInvocation;

public class CarDto {

    private String name;
    private int speed;
    private int horsePower;

    public CarDto setName(String name) {
        this.name = name;
        return this;
    }

    public CarDto setSpeed(int speed) {
        this.speed = speed;
        return this;
    }

    public CarDto setHorsePower(int horsePower) {
        this.horsePower = horsePower;
        return this;
    }
}
