package main.java.ru.asteises;

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

        for (int i = num.length - 1; i >= 0; i--) {
            Pair pair = new Pair(i, num[i]);
            stack.push(pair);
            // складываем значение в новый массив
        }
    }

    // stack.pop() вытаскиваем из стека с удалением
    // stack.peek() вытаскиваем без удаления
    // stack.push() кладём в стек
    // pair 5 12
    // pair 6 16

}
