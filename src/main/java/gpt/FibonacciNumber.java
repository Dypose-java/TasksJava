package gpt;

import java.util.stream.IntStream;

public class FibonacciNumber {
    public static void main(String[] args) {
        fibonacciNumber(10);




    }
    public static void fibonacciNumber(int num){
        int a =0,b=1,c;
        for (int i =0; i <num ; i++) {
            c=a+b;
            a=b;
            b=c;
           if (i<num-1)
               System.out.print(b+",");
           else System.out.print(b+";");

        }
    }
}
