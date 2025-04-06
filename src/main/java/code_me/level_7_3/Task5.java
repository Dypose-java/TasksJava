package code_me.level_7_3;

import java.util.Arrays;

public class Task5 {
    /**Сделайте метод, который параметром будет принимать массив
     *  с числами и возвращать максимальное и минимальное значение из этого массива в виде следующего массива:*/
    public static void main(String[] args) {
        int array[]={1,5,12,31,52};
        minAndMaxFromArray(array);
    } static void minAndMaxFromArray(int array[]){
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();
        System.out.printf("min:%d,max:%d",min,max);
    }
}
