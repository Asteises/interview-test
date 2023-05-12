package main.java.ru.asteises.patterns.propertyContainer;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        Movie movie1 = new Movie();
        movie1.setProp("id", 1);
        movie1.setProp("name", "Film 1");
        movie1.setProp("releaseDate", LocalDate.of(2023, 4, 25));
        System.out.println(movie1.getProp("id") + " *** " + movie1.getProp("name") + " *** " + movie1.getProp("releaseDate"));
        System.out.println(movie1.getImage());

        Movie movie2 = new Movie();
        movie2.setProp("country", "Russia");
        System.out.println(movie2.getProp("country"));
    }
}
