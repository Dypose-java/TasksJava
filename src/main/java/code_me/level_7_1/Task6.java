package code_me.level_7_1;

import java.util.stream.IntStream;

public class Task6 implements SumOfTheDivisors {
    public static void main(String[] args) {
        System.out.println( new Task6().sumOfTheDivisors(4));

    }
}
interface SumOfTheDivisors{
    default int sumOfTheDivisors(int num){
        int res =IntStream.rangeClosed(1,num).filter(el->num%el==0).sum();
        return res <=0 ? -1 : res;
    };
}
