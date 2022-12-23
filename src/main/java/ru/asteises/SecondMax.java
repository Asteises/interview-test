package main.java.ru.asteises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Реализовать алгоритм поиска индекса второго максимального значения в массиве;
public class SecondMax {

    public static void main(String[] args) {

        int[] num = {13, 12, 15, 11, 9, 12, 16};
        List<Integer> list = Arrays.stream(num).boxed().toList();
        Integer max = Collections.max(list);
        list.remove(max);
        int secondMax = Collections.max(list);
        System.out.println(secondMax);
    }

}
