package leetcode.programmingSkills;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        String s = "qwerty";
        boolean b = repeatedSubstringPattern11(s);


    }

    static boolean repeatedSubstringPattern11(String s) {
        String doubled=s+s;

        String trimmed=doubled.substring(1,doubled.length()-1);
        System.out.println();
        if(trimmed.contains(s))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
