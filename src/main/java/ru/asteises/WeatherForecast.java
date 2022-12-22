package main.java.ru.asteises;

import java.util.Arrays;

public class WeatherForecast {

    /* На вход приходит лист положительных числе или массив, каждое из чисел обозначает температуру в какой-то день(индекс числа и есть день).
    Для каждого дня определить количество дней до более теплой погоды.
    [13, 12, 15, 11, 9, 12, 16] -> [2, 1, 4, 2, 1, 1, 0]

     */
    public static void main(String[] args) {

        int[] num = {13, 12, 15, 11, 9, 12, 16};
        int[] result = new int[7];

        for (int i = 0; i < num.length; i++) {
            for (int k = i + 1; k < num.length; k++) {
                if (num[i] < num[k]) {
                    result[i] = k - i;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
