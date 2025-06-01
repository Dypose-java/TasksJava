package gpt;

import java.util.Arrays;
import java.util.HashMap;

public class MyTask {
    public static void main(String[] args) {
        int counterCharFromStrs = getCounterCharFromStrs("я еблааан", 'а');


    }

    public static int[] reversTemp(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }

    /*
     * Задача: Поменять местами значения двух переменных a и b с использованием временной переменной temp.
     * a=5,b=10: res b=5,a=10
     * */
    public static void reverseAAndB(int a, int b) {
        System.out.printf("a:%d,b:%d\n", a, b);
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("a:%d,b:%d\n", a, b);
    }

    /*
     * 2. Обмен значений без временной переменной
     * a=10,b=5
     */
    public static void reverseAAndBWithoutTemp(int a, int b) {
        if (a > b) {
            a = a - b;
            b = a + b;
            System.out.printf("a:%d,b:%d", a, b);
        } else if (b > a) {
            b = b - a;
            a = a + b;
            System.out.printf("a:%d,b:%d", a, b);

        }


    }

    public static void sortBubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void getMinAndMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int el : arr) {
            if (el < min)
                min = el;
            else if (el > max)
                max = el;
        }
        System.out.printf("min:%d,max:%d", min, max);

    }

    public static void reverseDoubleArrays(int[][] arr) {
        /*{1,2},
        {2,3},
        {3,4}
        * */
        for (int i = 0; i < arr.length; i++) {


        }
    }

    public static String reverseStrTemp(String str) {
        //берем половину и меняем ее
        char[] arrStr = str.toCharArray();
        for (int i = 0; i < arrStr.length / 2; i++) {
            char temp = arrStr[i];
            arrStr[i] = arrStr[arrStr.length - 1 - i];
            arrStr[arrStr.length - 1 - i] = temp;
        }
        return String.valueOf(arrStr);
    }

    //Циклический сдвиг массива
    /*Задача: Сдвинуть элементы массива вправо на 1 позицию. Последний элемент становится первым.
    5, 1, 2, 3, 4
    * */
    public static void shiftingArrayMy(int[] arr) {

        int temp = arr[0];
        arr[0] = arr[arr.length - 1];
        arr[arr.length - 1] = temp;
        for (int i = 1; i < arr.length - 1; i++) {
            int temp1 = arr[i];
            arr[i] = arr[arr.length - 1];
            arr[arr.length - 1] = temp1;
        }
        System.out.println(Arrays.toString(arr));


    }
    public static void shiftingArray(int[] arr) {
        //1,2,3,4,5

        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
            System.out.println(Arrays.toString(arr));
        }
        arr[0] = temp;
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
    public  static int getCounterCharFromStr(String str,char el){
        //только для ASCII
        int[]count = new int[256];
        for (char ch:str.toCharArray()){
            count[ch]++;
        }
        System.out.println(Arrays.toString(count));
        return count[el];
    }

    public static int getCounterCharFromStrs(String str,Character el){
        HashMap<Character,Integer> counter = new HashMap<>();
        for (char ch:str.toCharArray()){
            counter.put(ch,counter.getOrDefault(ch,0)+1);
        }
        System.out.println(counter);
        return counter.get(el);
    }

}

