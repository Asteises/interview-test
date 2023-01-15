package main.java.ru.asteises;

import java.util.Stack;

// На вход приходит строка состоящая из чисел, знаков операций и круглых скобок. Задача провалидировать строчку
// и проверить верно ли расставлены скобки.
// (({[()]()})) - valid
// (())[] - valid
// ({}) - invalid
// ({)} - invalid
public class ValidParentheses {

    public static void main(String[] args) {
        String string = "(8 + 8) (8 ()())";
        String string2 = "()()(){[()]}";
        System.out.println(validParentheses(string));
        System.out.println(validParenthesesSolution(string2));
    }

    public static boolean validParentheses(String string) {
        int flag = 0;
        for (int i = 0; i < string.length(); i++) {
            if (flag >= 0 && string.charAt(i) == '(') {
                flag++;
            } else if (flag >= 0 && string.charAt(i) == ')') {
                flag--;
            } else {
                return false;
            }
        }
        return flag == 0;
    }

    // ({}) - invalid ({[)
    // ({[]})
    // {
    public static boolean validParenthesesSolution(String string) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == '(' || string.charAt(i) == '{' || string.charAt(i) == '[') {
                stack.push(string.charAt(i));
            } else if ((stack.peek() == '(' && string.charAt(i) == ')')
                    || (stack.peek() == '{' && string.charAt(i) == '}')
                    || (stack.peek() == '[' && string.charAt(i) == ']')) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
