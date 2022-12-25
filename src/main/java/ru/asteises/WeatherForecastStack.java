package main.java.ru.asteises;

import java.util.Arrays;
import java.util.Stack;

public class WeatherForecastStack {

    public static void main(String[] args) {

        int[] num = {13, 12, 15, 11, 9, 12, 1};
        //Ожидаем результат: [2, 1, 4, 2, 1, 1, 0]

        System.out.println(Arrays.toString(toArray2(num)));
    }

    static class Pair {
        int value;
        int index;
        public Pair(int value, int index) {
            this.index = index;
            this.value = value;
        }
    }

    public static int[] toArray2(int[] numbers) {
        // Способ №2
        Stack<Pair> stack = new Stack<>();
        int[] result = new int[numbers.length]; // Создаем новый массив такой же длины как и первый;
        for (int i = numbers.length - 1; i >= 0; i--) { // проходимся по массиву с конца;
            while (!stack.isEmpty() && stack.peek().value <= numbers[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                result[i] = stack.peek().index - i;
            }
            stack.push(new Pair(numbers[i], i));
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
