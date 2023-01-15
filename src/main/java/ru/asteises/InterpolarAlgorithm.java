package main.java.ru.asteises;

import java.util.Arrays;

public class InterpolarAlgorithm {

    public static void main(String[] args) {
        int[] sortNumArray = {-2, 0, 3, 7, 11, 19, 26, 31, 39, 45, 50};
        int x = 0;

        System.out.println(classicSolution(sortNumArray, x));
        System.out.println(recursionSolution(sortNumArray, x));
    }

    //TODO Как проверять на сколько равномерно распределены данные?
    public static Integer classicSolution(int[] sortNumArray, int x){

        int targetIndex = 0;

        int leftIndex = 0;
        int leftValue = sortNumArray[leftIndex];

        int rightIndex = sortNumArray.length - 1;
        int rightValue = sortNumArray[rightIndex];

        if (x == rightValue) {
            return rightIndex;
        }
        if (x == leftValue) {
            return leftIndex;
        }

        while (x != sortNumArray[targetIndex] || leftIndex != rightIndex) {

            targetIndex = (x - leftValue) * (leftIndex - rightIndex) / (leftValue - rightValue) + leftIndex;

            if (x == sortNumArray[targetIndex]) {
                return targetIndex;
            } else if (x > sortNumArray[targetIndex]) {
                leftIndex = targetIndex + 1;
            } else {
                rightIndex = targetIndex - 1;
            }
        }
        return null;
    }
    //TODO Не работает
    public static Integer recursionSolution(int[] sortNumArray, int x) {
        int leftIndex = 0;
        int leftValue = sortNumArray[leftIndex];

        int rightIndex = sortNumArray.length - 1;
        int rightValue = sortNumArray[rightIndex];

        int targetIndex = (x - leftValue) * (leftIndex - rightIndex) / (leftValue - rightValue) + leftIndex;

        if (x > sortNumArray[targetIndex]) {
            int[] subArray = Arrays.copyOfRange(sortNumArray, targetIndex + 1, rightIndex);
            recursionSolution(subArray, x);
        } else if (x < sortNumArray[targetIndex]) {
            int[] subArray = Arrays.copyOfRange(sortNumArray, leftIndex, rightIndex - 1);
            recursionSolution(subArray, x);
        } else if (x == sortNumArray[targetIndex]) {
            return targetIndex;
        }
        return null;
    }
}
