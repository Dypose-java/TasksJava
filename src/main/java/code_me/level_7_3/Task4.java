package code_me.level_7_3;

import java.util.stream.IntStream;

public class Task4 {
    public static void main(String[] args) {
       IntStream.range(1,997).filter(Task4::isPrime).forEach(el-> System.out.print(el+" "));
    }
    static boolean isPrime(int num){
        if (num<=1) return false;
        return IntStream.range(2, (int) Math.sqrt(num) + 1)
                .noneMatch(i -> num % i == 0);
        //4
        //2,17
        //
    }
}
