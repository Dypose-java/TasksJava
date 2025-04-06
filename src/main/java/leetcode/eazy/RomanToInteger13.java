package leetcode.eazy;

import java.util.*;

public class RomanToInteger13 {
    static int roman(String str){
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        int res=0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (roman.get(str.charAt(i))<roman.get(str.charAt(i+1)))
                res-=roman.get(str.charAt(i));
            else
                res+=roman.get(str.charAt(i));
        }
       return res+roman.get(str.charAt(str.length()-1));
    }
    public static void main(String[] args) {
        int mcmxciv = roman("MCMXCIV");
        System.out.println();
    }
}