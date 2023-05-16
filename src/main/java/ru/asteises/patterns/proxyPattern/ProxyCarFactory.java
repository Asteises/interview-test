package main.java.ru.asteises.patterns.proxyPattern;

public class ProxyCarFactory implements CarFactory {

    private RealCarFactory realCarFactory;

    @Override
    public void createCar() {
        if (realCarFactory == null) {
            realCarFactory = new RealCarFactory();
        }
        realCarFactory.createCar();
    }
}
