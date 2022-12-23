package main.java.ru.asteises;

import java.util.Arrays;
import java.util.Stack;

public class WeatherForecastStack {

    static class Pair {
        int value;
        int index;
        public Pair(int value, int index) {
            this.index = index;
            this.value = value;
        }
    }

    public static void main(String[] args) {

        Stack<Pair> stack = new Stack<>();
        int[] num = {13, 12, 15, 11, 9, 12, 16};
        int[] result = new int[num.length]; // Создаем новый массив такой же длины как и первый;
        //Ожидаем результат: [2, 1, 4, 2, 1, 1, 0]

        for (int i = num.length - 1; i >= 0; i--) { // проходимся по массиву с конца;
            Pair pair = new Pair(num[i], i); // каждый раз создаем новую пару;
            if (stack.empty()) { // Чтобы положить первый элемент в стек;
                stack.push(pair);
                continue;
            }
            if (pair.value > stack.peek().value) {
                stack.pop();
            }
            result[pair.index] = stack.peek().index - pair.index;
            if (stack.size() == 1) {
                stack.push(pair);
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
