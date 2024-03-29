package main.java.ru.asteises.atgorithms;

import java.util.Scanner;

// Даны две стринги в каждой по одному слову. Проверять являются ли эти слова анаграммой.
public class Anagramma {

    public static String sort(String string) {

        return string
                .chars()
                .sorted()
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }

    public static Boolean valid(String s1, String s2) {
        return s1.equals(s2);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слово:");
        String s1 = scanner.nextLine();
        System.out.println("Введите второе слово:");
        String s2 = scanner.nextLine();

        if (s1.length() == s2.length()) {
            String s1Sorted = sort(s1);
            String s2Sorted = sort(s2);
            System.out.println(valid(s1Sorted, s2Sorted));
        } else {
            System.out.println("Точно не анаграмма, так как длины слов различаются.");
        }
    }
}
