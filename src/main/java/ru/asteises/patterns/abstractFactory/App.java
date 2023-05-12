package main.java.ru.asteises.patterns.abstractFactory;

import main.java.ru.asteises.patterns.abstractFactory.audi.AudiCoupe;

public class App {

    public static void main(String[] args) {

        AudiCoupe audiCoupe = new AudiCoupe();

        audiCoupe.setId(1);
        audiCoupe.setName("A3");

        audiCoupe.makeDoors();
        audiCoupe.makeEngine();
        audiCoupe.makeTurbo();

        System.out.println(audiCoupe.getId());
        System.out.println(audiCoupe.getName());
    }
}
