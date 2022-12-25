package main.java.ru.asteises;

import java.util.Scanner;
import java.util.Stack;

// Дана стринга, необходимо ее развернуть;
public class ReverseWord {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово:");
        String word = scanner.nextLine();

        if (word == null || word.equals("")) {
            System.out.println("ВВедена пустая строка: " + word);
        } else {

            // Способ №1
            StringBuilder stringBuilder = new StringBuilder(word);
            System.out.println("Перевернули слово способом 1: " + stringBuilder.reverse());

            // Способ №2
            char[] chars = word.toCharArray();
            Stack<Character> characters = new Stack<>();
            for (Character character : chars) {
                characters.push(character);
            }
            int i = 0;
            while (!characters.isEmpty()) {
                chars[i++] = characters.pop();
            }
            System.out.println("Перевернули слово способом 1: " + String.copyValueOf(chars));

            // Способ №3
        }
    }
}
