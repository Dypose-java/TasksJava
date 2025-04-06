package leetcode.programmingSkills;

import java.util.HashMap;
import java.util.Map;

import static leetcode.programmingSkills.FindTheDifference.sdffsdfsd;

public class FindTheDifference {
    public static void main(String[] args) {
        char theDifference = new FindTheDifference().findTheDifference("abcd", "badec");
        System.out.println();
        char examp = new FindTheDifference().example("abcd", "badec");
        System.out.println();
        HashMap<Character, Integer> count = new HashMap<>();
        count.put('a', 52);
        count.put('b', 52);
        count.put('c', 52);
        count.put('c', 0);
        count.remove('c');
        System.out.println(count);

    }

    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> count = new HashMap<>();
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (char el : t.toCharArray()) {
            count.put(el, count.getOrDefault(el, 0) + 1);
        }
        for (Map.Entry<Character, Integer> el : count.entrySet()) {
            if (el.getValue() == 1) {
                count.clear();
                count.put(el.getKey(), el.getValue());
            }
        }
        return (char) count.keySet().toArray()[0];
    }

    public char example(String s, String t) {
        Map<Character, Integer> count = new HashMap<>();

        for (char c : t.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            count.put(c, count.get(c) - 1);//перезапись знвчение и изменение прошлого значения на -1
            if (count.get(c) == 0) {
                count.remove(c);
            }
        }
        System.out.println(count);

        return (char) count.keySet().toArray()[0];
    }

    public static void sdffsdfsd(String s1, String s2) {
        HashMap<Character, Integer> count = new HashMap<>();
        for (char s:s2.toCharArray()){
            count.put(s,count.getOrDefault(s,0)+1);
        }
        for (char s:s1.toCharArray()){
            count.put(s,count.getOrDefault(s,0)-1);
            if (count.get(s)==0){
                count.remove(s);
            }
        }
        System.out.println(count.values().toArray()[0]);
    }
}
class dfsfs{

public static void main(String[] args) {
    sdffsdfsd("abcd", "badec");

}
        }