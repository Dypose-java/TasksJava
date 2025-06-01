package gpt;

public class FactorialNumber {
    public static void main(String[] args) {
        int factorial = factorial(5);
        int factorial2 = factorialGpt(5);
    }

    public static int factorial(int num) {
        if (num < 0) throw new IllegalArgumentException("num>=0");
        int res = num;
        while (num > 1) {
            num--;
            res *= num;
        }
        return res;
    }
    public static int factorialGpt(int num){
        if (num < 0) throw new IllegalArgumentException("num>=0");
        int res=1;
        for (int i = 2; i<=num ; i++) {
            res*=i;
        }
        return res;
    }
}
