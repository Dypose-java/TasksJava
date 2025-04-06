package leetcode.programmingSkills;

import java.util.Arrays;

public class SignProductArray {
    public static void main(String[] args) {
        int[] arr = {-1,-2,-3,-4,3,2,1};
        int[] arr1 = {1,5,0,2,-3};
        int[] arr2 = {-1,1,-1,1,-1};
        int[] arr3 = {41,65,14,80,20,10,55,58,24,56,28,86,96,10,3,84,4,41,13,32,42,43,83,78,82,70,15,-41};
        int i = arraySign(arr);
        int i1 = arraySign(arr1);
        int i2 = arraySign(arr2);
        int i3 = arraySign(arr3);
    }

    static int arraySign(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                return 0;
            else if (nums[i] < 0)
                count++;
        }
        if (count % 2 == 0)
            return 1;
        else return -1;
    }
}
