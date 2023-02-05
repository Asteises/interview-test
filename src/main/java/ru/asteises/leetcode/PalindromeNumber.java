package main.java.ru.asteises.leetcode;

import java.util.Stack;

public class PalindromeNumber {

    public static void main(String[] args) {
        System.out.println(stackSolution(121));
        System.out.println(classicSolution(121));
    }

    public static boolean stackSolution(int x) {
        String stringNumber = String.valueOf(Integer.valueOf(x));

        if(stringNumber.length() == 1) {
            return true;
        }

        char[] charsStringNumber = stringNumber.toCharArray();

        Stack<Character>  stackCharacter = new Stack<>();

        for (Character character: charsStringNumber) {
            stackCharacter.push(character);
        }

        int i = 0;

        while (!stackCharacter.empty()) {
            charsStringNumber[i++] = stackCharacter.pop();
        }

        String reverseNumber = String.valueOf(charsStringNumber);

        return stringNumber.equals(reverseNumber);
    }
    // value = 0xA
    // [0xA] -> [0x14] -> [0xFC] -> [0xAG] -> [0xB] -> [0X54]

    public static boolean classicSolution(int number) {
        String stringNumber = Integer.toString(number);
        // Двигаемся с обоих концов слова к середине
        for (int i = 0; i < (stringNumber.length() / 2); i++) {
            // Сравниваем символы попарно
            if (stringNumber.charAt(i) != stringNumber.charAt(stringNumber.length() - i - 1)) {
                // Если найдено несоответствие - слово не палиндром
                return false;
            }
        }
        return true;
    }
}
