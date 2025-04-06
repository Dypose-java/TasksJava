package code_me.level_7_6;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
/**Сделайте метод, который параметром будет получать строку со словами,
 *  а возвращать строку в верхнем регистре, состоящую из первых букв слов.*/
String text="Nescafe dolce gusto 52 msk";
        System.out.println(extractFirstLetters(""));
    }
    static String extractFirstLetters(String text){
        if (!text.isEmpty() || text == null)
            return Arrays.stream(text.split("\\s+")).map(el->el.substring(0,1)).map(String::toUpperCase).collect(Collectors.joining());
        else
            return "-1";

    }
}

