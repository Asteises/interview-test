package main.java.ru.asteises.atgorithms;

public class SumVowels {

    public static void main(String[] args) {
        System.out.println(classicSolution("айболит"));
    }

    public static int classicSolution(String word) {
        String vowels = "аеёийоуыэюя";
        char[] chars = word.toCharArray();
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(chars[i]) != -1) {
                result++;
            }
        }
        return result;
    }
}
