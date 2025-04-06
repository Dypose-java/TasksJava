package leetcode.eazy;

public class PalindromeNumber9 {
    class Solution {
        static public boolean isPalindrome(int x) {
            String str =String.valueOf(x);
            String strReverse = new StringBuilder(str).reverse().toString();
            if (str.equals(strReverse)) return true;
            else return false;
        }

    }

    public static void main(String[] args) {
            boolean palindrome = Solution.isPalindrome(1214);
            System.out.println(palindrome);
    }
}
