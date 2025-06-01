import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {
        boolean b = validAnagram("anagram", "nagaram");
        boolean b1 = validAnagram("rat", "car");

    }
    public static  boolean validAnagram(String s,String t){
        char[] charArray = s.toCharArray();
        char[] charArray1 = t.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray);
        return String.valueOf(charArray).equals(String.valueOf(charArray1));

    }
}
