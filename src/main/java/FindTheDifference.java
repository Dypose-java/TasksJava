import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FindTheDifference {
    /*
    * Вам даны две строки s и t.

    Строка t генерируется путем случайного перемешивания строки sи последующего
    * добавления еще одной буквы в случайную позицию.

    Верните букву, которая была добавлена к t.

    Пример 1:

    Ввод: s = "abcd", t = "abcde"
     Вывод: "e"
     Пояснение: "e" — это буква, которая была добавлена.
    Пример 2:

    Вход: s = "", t = "y"
     Выход: "y"*/
    public static void main(String[] args) {
        String s = "", t = "y";
        char c1 = FindTheDifference(s, t);
        Character c = findTheDifferenceByHasMap(s, t);


    }

    public static Character findTheDifferenceByHasMap(String s, String t) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            if (hashMap.containsKey(t.charAt(i))) {
                hashMap.put(t.charAt(i), hashMap.get(t.charAt(i)) + 1);
            } else hashMap.put(t.charAt(i), hashMap.getOrDefault(t.charAt(i), 0) + 1);

        }
        Optional<Character> first = hashMap.entrySet().stream().filter(el -> el.getValue() == 1).map(Map.Entry::getKey).findFirst();
        return first.get();
    }

    public static char FindTheDifference(String s, String t) {
        if (s.isEmpty())
            return t.charAt(0);

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (!s.contains(String.valueOf(t.charAt(j)))) {
                    return t.charAt(j);
                }
            }
        }

        return 0;
    }
}
