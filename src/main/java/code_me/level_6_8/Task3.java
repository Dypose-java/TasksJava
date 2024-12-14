package code_me.level_6_8;

import java.util.List;

public class Task3 {
    /**
     * Дана строка со словами. Отсортируйте слова в алфавитном порядке.
     */
    public static void main(String[] args) {
        String text ="Привет,как дела?Чем Азанимаешься,";
        sortWordOFText(text);

    }

    private static void sortWordOFText(String text) {
        StringBuilder stringBuilder = new StringBuilder(text.replaceAll("[\\p{Punct}]"," ").trim());
        List<String> splitText = List.of(stringBuilder.toString().split(" "));
        splitText.stream().sorted().forEach(System.out::println);
    }
}