package leetcode.programmingSkills;

public class FindTheIndexFirstOccurrence {
    public static void main(String[] args) {
        String haystack="mississippi",needle="issi";
        System.out.println(haystack.indexOf(needle));

        int res =strStr2("sadbutsad","sad");
        int res1 =strStr2("leetcode","leeto");
        int res2 =strStr2("sadbutsad","sad");
        int res3 =strStr2("mississippi","issi");

        System.out.println();
    }

    static int strStr(String haystack, String needle) {
        if (haystack.contains(needle)){

           while (!haystack.isEmpty()){
               haystack=haystack.substring(0,haystack.length()-1);
            if (haystack.equals(needle)){
                break;
            }
           }
        }else
            return -1;
        System.out.println();
        return haystack.indexOf(needle);
    }
    static int strStr1(String haystack, String needle) {
        int i = 0;
        if (haystack.contains(needle)){
            while (haystack.length()>needle.length()){
                i = haystack.indexOf(needle);
                haystack=haystack.substring(i,haystack.length()-1);
                if (haystack.isEmpty()){
                    break;
                }
            }
        }else return -1;
        return i;
    }
    static int strStr2(String haystack, String needle) {
        if (haystack.contains(needle)){
            return haystack.indexOf(needle);
        }else return -1;
    }
    }


