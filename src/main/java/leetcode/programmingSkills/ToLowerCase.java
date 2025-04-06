package leetcode.programmingSkills;

public class ToLowerCase {
    public static void main(String[] args) {
        String hello = toLowerCase("Hello");
        String here = toLowerCase("here");
        String lovely = toLowerCase("LOVELY");
    }
    public static String toLowerCase(String s) {
        for (int i = 0; i <s.length() ; i++) {
            if (Character.isUpperCase(s.charAt(i))){
                return s.toLowerCase();
            }
        }
        return s;
    }
}
