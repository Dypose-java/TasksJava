package leetcode.eazy;

public class LongestCommonPrefix {
    class Solution {
        static public String longestCommonPrefix(String[] strs) {
            /*String str =strs[0];
            List<String> listPrefix = new ArrayList<>();
            for (int i = 0;i<strs.length-1;i++){
                if (strs[i+1].contains(str.substring(0,2))){
                    return str.substring(0,2);
                }else return "";
            }
            return "There is no common prefix among the input strings";*/


            return null;
        }
    }
}

class fsf {
    public static String longestCommonPrefix(String[] strs) {
        String firstEl = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(firstEl)) {
                firstEl = firstEl.substring(0, firstEl.length() - 1);
                if (firstEl.isEmpty()) {
                    System.out.println("There is no common prefix among the input strings");
                    return "";
                }
            }

        }
        return firstEl;
    }
    public static void main(String[] args) {
        String strs[] = {"flower", "flow", "flight"};
        String strs1[] = {"c","acc","ccc"};
        String string = longestCommonPrefix(strs);
        System.out.println(string);
    }
}










