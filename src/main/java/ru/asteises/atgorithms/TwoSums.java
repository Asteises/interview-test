package main.java.ru.asteises.atgorithms;

import java.util.Arrays;

// На вход приходит массив int и значение k, необходимо найти два значения (индексы) в массиве, которые в сумме дают k;
public class TwoSums {

    public static void main(String[] args) {

        //int[] num = {13, 12, 15, 11, 9, 12, 16};
        int[] nums = {1, 99, 101, 102, 103};
        //{9, 11, 12, 12, 13, 16, 17} n log(n)
        // {1, 9999, 123123123, 1233333333}
        // {1, 2, 9999, 11123123}
        int k = 100;

        System.out.println(Arrays.toString(solution1(nums, k)));
        System.out.println(Arrays.toString(solution2(nums, k)));

    }

    public static int[] solution1(int[] nums, int k) {
        int m = 0;
        for (int i = 0; i < nums.length; i++) {
            m = k - nums[i];
            for (int l = i + 1; l < nums.length; l++) {
                if (nums[l] == m) {
                    System.out.println("Значения найдены: " + i + " " + l);
                    return new int[] {i, l};
                }
            }
        }
        return null;
    }

    public static int[] solution2(int[] nums, int k) {
        Arrays.sort(nums);
        int l = nums.length - 1;
        int m = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[m] + nums[l] == k) {
                return new int[] {m, l};
            } else if (nums[m] + nums[l] > k) {
                l--;
            } else if (nums[m] + nums[l] < k) {
                m++;
            }
        }
        return null;
    }
}
