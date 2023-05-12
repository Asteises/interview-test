package main.java.ru.asteises.patterns.builder;

public class Car {

    private String name;
    private Integer speed;
    private Integer horsePower;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", horsePower=" + horsePower +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
