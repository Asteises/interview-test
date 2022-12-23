package main.java.ru.asteises;

import java.util.*;

// Дана стринга, необходимо ее развернуть;
public class ReverseWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово:");
        String word = scanner.nextLine();

        StringBuilder stringBuilder = new StringBuilder(word);
        System.out.println("Перевернули слово: " + stringBuilder.reverse());
    }
}
