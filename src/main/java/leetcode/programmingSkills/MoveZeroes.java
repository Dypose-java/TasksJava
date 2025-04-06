package leetcode.programmingSkills;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        int arrInt[] = {0,1,0,3,12};
       // moveZeroes.MymoveZeroes(arrInt);
        //moveZeroes.moveZeroes(arrInt);
        moveZeroes.MymoveZeroes1(arrInt);
    }
    public void MymoveZeroes(int[] nums) {
        int[] array = Arrays.stream(nums).sorted().filter(el->el>0).toArray();
        int[] array1 = Arrays.stream(nums).sorted().filter(el -> el == 0).toArray();
       int[] res=Arrays.copyOf(array,array.length+array1.length);
        String string = Arrays.toString(res);
        System.out.println(string);
    }
    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }


        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
        System.out.println(Arrays.toString(nums));
    }
    public void MymoveZeroes1(int[] nums) {
        for (int i = 0; i <nums.length ; i++) {
           if (nums[i]==0){

           }
            }

        }

    }

