package code_me.level_6_8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task4 {
    /**
     * Дана строка с датой:
     * "2025-2-1"
     * Напишите код, который при необходимости добавит нули к месяцу и дню:
     * "2025-02-01"
     */
    public static void main(String[] args) {
        String date ="2025-2-1";
        System.out.println(correctDate(date));
    }
    static String correctDate (String date){
        return Arrays.stream(date.split("-")).map(el->el.length()==1?0+el:el).collect(Collectors.joining("-"));
    }
}
