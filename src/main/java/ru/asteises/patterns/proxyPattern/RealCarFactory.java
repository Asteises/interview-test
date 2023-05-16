package main.java.ru.asteises.patterns.proxyPattern;

public class RealCarFactory implements CarFactory {

    public RealCarFactory() {
        veryHardInitialConfig();
    }

    @Override
    public void createCar() {
        System.out.println("car in processing");
    }

    private void veryHardInitialConfig() {
        System.out.println("Loading initial configuration...");
    }
}
