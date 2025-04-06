package leetcode.programmingSkills;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PlusOne {
    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        //int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] arr1 = {8,9};

        int[] ints = plusOne.plusOne1(arr1);


    }

    public int[] plusOne(int[] digits) {
        long collect = Long.parseLong(Arrays.stream(digits).mapToObj(String::valueOf).collect(Collectors.joining(""))) + 1;
        return Arrays.stream(String.valueOf(collect).split("")).mapToInt(Integer::parseInt).toArray();


    }

    public int[] plusOne1(int[] digits) {
        //9
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] !=9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
