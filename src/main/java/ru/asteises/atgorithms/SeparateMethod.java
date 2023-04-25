package main.java.ru.asteises.atgorithms;

public class SeparateMethod {

    public static void main(String[] args) {
        System.out.println(classicSolution("Дом", "И", 6));
    }

    public static String classicSolution(String line, String separator, int count) {

        StringBuilder sb = new StringBuilder();
        if (count <= 0) {
            return line;
        } else {
            for (int i = 0; i < count; i++) {
                sb.append(line).append(separator);
            }
            sb.delete(sb.length() - separator.length(), sb.length());
        }
        return String.valueOf(sb);
    }
}
