package gpt;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseStr {
    public static void main(String[] args) {
        String string = reverseStr("123456789");
        String string1 = reverseStr1("123456789");
        String string2 = reverseStr2("123456789");
    }

    public static String reverseStr(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static String reverseStr1(String str) {
        List<String> list = new java.util.ArrayList<>(Arrays.stream(str.split("")).toList());
        Collections.reverse(list);
        return list.stream().collect(Collectors.joining(""));
    }

    public static String reverseStr2(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;
        while (left<right){
            char temp =charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;
            left++;
            right--;
        }
        return new String(charArray);

    }
}
