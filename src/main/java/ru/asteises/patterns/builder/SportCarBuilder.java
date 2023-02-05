package main.java.ru.asteises.patterns.builder;

public class SportCarBuilder implements CarBuilder {

    private String name;
    private Integer speed;
    private Integer horsePower;

    @Override
    public CarBuilder setCarName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public CarBuilder setCarSpeed(Integer speed) {
        this.speed = speed;
        return this;
    }

    @Override
    public CarBuilder setCarHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
        return this;
    }

    @Override
    public Car build() {
        if (this.name == null) {
            this.name = "just car";
        }
        if (this.speed == null) {
            this.speed = 100;
        }
        if (this.horsePower == null) {
            this.horsePower = 200;
        }

        Car car = new Car();
        car.setName(this.name);
        car.setSpeed(this.speed);
        car.setHorsePower(this.horsePower);

        return car;
    }
}
