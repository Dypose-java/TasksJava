package leetcode.programmingSkills;

import java.util.Arrays;

public class MonotonicArray {
    public static void main(String[] args) {
        int i[] = {1, 2, 2, 3};
        int i1[] = {6, 5, 4, 4};
        int i2[] = {1, 3, 2};
        int i3[] = {6, 6, 6, 5};
        int i4[] = {1,3,2,4};
        boolean monotonic = isMonotonic3(i);
         boolean monotonic1 = isMonotonic3(i1);
        boolean monotonic2 = isMonotonic3(i2);
        boolean monotonic3 = isMonotonic3(i3);
        boolean monotonic31 = isMonotonic3(i4);

    }


    static boolean isMonotonic3(int[] nums) {

        boolean isIncreasing=nums[0]<nums[nums.length-1];

        if (isIncreasing){
            for (int i = 0; i < nums.length-1; i++) {
             if (!(nums[i]<=nums[i+1]))
                 return false;
            }
        }
        else
            for (int i = 0; i < nums.length-1; i++) {
                if (!(nums[i]>=nums[i+1]))
                    return false;

            }
        return true;
    }

    }
