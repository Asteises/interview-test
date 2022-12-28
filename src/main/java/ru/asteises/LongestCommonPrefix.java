package main.java.ru.asteises;

// Приходит массив из строк, необходимо найти самый длинный общий префикс;
public class LongestCommonPrefix {

    public static void main(String[] args) {

        String[] strings = {"flower", "flow", "flick"};
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
        System.out.println(result);
    }
}
