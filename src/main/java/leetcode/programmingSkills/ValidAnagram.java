package leetcode.programmingSkills;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ValidAnagram {
    public static void main(String[] args) {
        boolean is= new ValidAnagram().isAnagram("anagram","nagaram");
        boolean is1= new ValidAnagram().isAnagram("rat","car");



    }
    public boolean isAnagram(String s, String t) {
        String collect = Arrays.stream(s.split("")).sorted().collect(Collectors.joining(""));
        String collect1 = Arrays.stream(t.split("")).sorted().collect(Collectors.joining(""));
        if (collect.equals(collect1)){
            return true;
        }else return false;
    }
}
