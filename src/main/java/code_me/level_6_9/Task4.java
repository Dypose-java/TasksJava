package code_me.level_6_9;

import java.util.stream.IntStream;

public class Task4 {
    /**
     * Дана некоторая строка с числом:
     * "1234567"
     * Отделите тройки цифр пробелами, начиная с конца числа. В нашем случае должно получится следующее:
     * "1 234 567"
     */
    public static void main(String[] args) {

        String number = "1234567";
        StringBuilder sb = new StringBuilder(number);
        for (int i = sb.length() - 3; i > 0; i -= 3) {
            sb.insert(i, " ");
        }
        System.out.println(sb);

    }
}
