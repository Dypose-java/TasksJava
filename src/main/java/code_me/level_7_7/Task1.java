package code_me.level_7_7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    /**
     * Сделайте метод, который параметром будет принимать текст со словами,
     * а возвращать текст, в котором эти слова будут отсортированы в алфавитном порядке.*/
    public static void main(String[] args) {
        String text="Сделайте метод который параметром будет принимать текст со словами";
        System.out.println(sortText(text));
    }
    static String sortText(String text){
        List<String> list = new ArrayList<>(Arrays.asList(text.split("\\s+")));
        Collections.sort(list, String.CASE_INSENSITIVE_ORDER);
//        return list.stream().sorted().collect(Collectors.joining(" "));
        return list.stream().map(el->Character.isUpperCase(el.charAt(0))?el.toLowerCase():el).collect(Collectors.joining(" "));
//        return String.join(" ",list);
    }
}
