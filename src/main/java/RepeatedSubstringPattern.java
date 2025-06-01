public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        boolean b = repeatedSubstringPattern("abcabcabcabc");

    }

    public static boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int len = 1; len <= n / 2; len++) {
            if (n % len == 0) {
                String substring = s.substring(0, len);
                String constructed = substring.repeat(n / len);
                if (constructed.equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }
}
