package gpt;

public class PrimeNumber {
    public static void main(String[] args) {

        /*boolean primeNumber1 = isPrimeNumber(2);
        boolean primeNumber2 = isPrimeNumber(3);
        boolean primeNumber3 = isPrimeNumber(5);
        boolean primeNumber4 = isPrimeNumber(7);
        boolean primeNumber5 = isPrimeNumber(11);*/
        boolean primeNumber6 = isPrimeNumber(4);


    }

    public static boolean isPrimeNumber(int num) {
        if (num <= 1) return false;

        for (int i = 2; i <num ; i++) {
            if (num % i == 0) {
              return false;
            }

        }
        return true;
    }

}
