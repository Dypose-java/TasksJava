package leetcode.eazy;

import java.util.List;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c); // Добавляем открывающую скобку в стек
            } else {
                if (stack.isEmpty()) return false; // Нет открывающей скобки
                System.out.println();
                char top = stack.pop(); // Достаём верхнюю скобку

                // Проверяем, соответствует ли открывающая скобка закрывающей
                if ((c == ')' && top != '(') ||
                        (c == '}' && top != '{') ||
                        (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty(); // Если стек пуст, строка корректна
    }

    static boolean isValids(String s) {
        List<Character> list1 = List.of('{', '}');
        List<Character> list2 = List.of('(', ')');
        List<Character> list3 = List.of('[', ']');
        int count1 = 0, count2 = 0, count3 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (list1.contains(s.charAt(i)))
                count1++;
            else if (list2.contains(s.charAt(i)))
                count2++;
            else if (list3.contains(s.charAt(i)))
                count3++;
            else System.out.println("s is not valid");
        }
        if (count1 != 0 & count1 % 2 == 0 || count2 != 0 & count2 % 2 == 0 || count3 != 0 & count3 % 2 == 0) {
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {

       // System.out.println(isValid("([)]"));
        System.out.println(isValid("()[]{}"));
       // System.out.println(isValid("([)]"));
    }
}
