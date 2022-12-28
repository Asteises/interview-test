package main.java.ru.asteises;

// Реализовать алгоритм поиска индекса второго максимального значения в массиве;
public class SecondMax {

    public static void main(String[] args) {

        Integer[] num = {13, 12, 15, 11, 9, 12, 16};

        // Способ №1
        // Отсортировать массив, сделать Distinct и взять 2 значение;

        // Способ №2
        int maximum = num[0];
        int secondMaximum = num[1];
        for (int checkNumber : num) {
            if (checkNumber > maximum) {
                secondMaximum = maximum;
                maximum = checkNumber;
            } else if (checkNumber > secondMaximum) {
                secondMaximum = checkNumber;
            }
        }
        System.out.println(secondMaximum);
    }

}
