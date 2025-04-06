package leetcode.programmingSkills;

import java.util.Arrays;

public class LengthLastWord {
    public static void main(String[] args) {
        int i = lengthOfLastWord("luffy is still joyboy");

    }
    public static int lengthOfLastWord(String s) {
        String[] split = s.split(" ");
        return split[split.length-1].length();
    }
}
