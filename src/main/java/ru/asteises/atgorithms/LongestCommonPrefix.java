package main.java.ru.asteises.atgorithms;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

// Приходит массив из строк, необходимо найти самый длинный общий префикс;
public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strings = {"flower", "flow", "flick"};
        System.out.println(searchLongestPrefix(strings));
        System.out.println(searchLongestPrefixSolutionTwo(strings));

    }

    public static String searchLongestPrefix(String[] strings) {

        String result = "";
        int flag = strings.length - 1;
        for (int i = 0; i < strings[0].toCharArray().length; i++) {
            for (int k = 1; k < strings.length; k++) {
                if (strings[0].charAt(i) == strings[k].charAt(i)) {
                    flag--;
                }
                if (flag == 0) {
                    result = result + String.valueOf(strings[0].charAt(i));
                }
            }
            if (flag == 1 || flag == 2) {
                break;
            } else {
                flag = strings.length - 1;
            }
        }
        return result;
    }

    public static String searchLongestPrefixSolutionTwo(String[] strings) {

        StringBuilder result = new StringBuilder();

        Arrays.sort(strings);

        String firstString = strings[0];
        String lastString = strings[strings.length - 1];

        for (int i = 0; i < firstString.length(); i++) {
            if (firstString.charAt(i) == lastString.charAt(i)) {
                result.append(firstString.charAt(i));
            } else {
                break;
            }
        }
        return result.toString();
    }

}
