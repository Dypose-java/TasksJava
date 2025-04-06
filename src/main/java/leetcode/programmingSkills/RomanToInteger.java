package leetcode.programmingSkills;

import java.util.*;

public class RomanToInteger {
    public static void main(String[] args) {
        int i = romanToInt1("MCMXCIV");

    }

    public static int romanToInt1(String s) {
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);
        //MCMXCIV
        int res = 0;
            for (int j = 0; j < s.length() - 1; j++) {
                int fEl = roman.get(s.charAt(j));
                int lEl = roman.get(s.charAt(j + 1));
                if (fEl < lEl)
                    res -= fEl;
                else {
                    res += fEl;
                }

            }

        return res+roman.get(s.charAt(s.length()-1));
    }
}


