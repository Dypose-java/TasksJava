package code_me.Level_7_4;

import java.util.stream.IntStream;

public class Task1 {
    /**Сделайте метод, который параметром будет принимать число, а возвращать количество его делителей.*/
    public static void main(String[] args) {
        System.out.println(sumDividerNum(6));//1,2,3,6->4
    }static int sumDividerNum(int num){
        return (int)IntStream.rangeClosed(1,num).filter(el->num%el==0).count();
    }
}
