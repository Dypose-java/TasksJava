package leetcode.programmingSkills;

import java.util.Arrays;

public class ArithmeticProgressionSequence {
    public static void main(String[] args) {
        int i[] = {3, 5, 1};
        int i1[] = {1, 2, 4};
        boolean b = canMakeArithmeticProgression(i1);
        boolean b1 = canMakeArithmeticProgression(i);


    }
    static boolean canMakeArithmeticProgressionMy(int[] arr) {
        Arrays.sort(arr);
        int num = arr[1] - arr[0];
        int res[] = new int[arr.length];
        res[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            res[i] = res[i - 1] + num;
        }

        return Arrays.equals(arr, res);
    }
    static boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int num=arr[1]-arr[0];
        for (int i = 2; i <arr.length; i++) {
            if (arr[i]-arr[i-1]!=num)
                return false;
        }
        return true;
    }
}

