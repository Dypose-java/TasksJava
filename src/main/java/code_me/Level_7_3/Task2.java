package code_me.Level_7_3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Task2 {
    /**Сделайте метод, который параметром будет принимать массив и возвращать новый массив,
     * не содержащий одинаковые, рядом стоящие элементы.*/
    public static void main(String[] args) {
        int arrExample[]={1,1,1,1,2,3,4,5,6};
        int res[]=arrayDontAdjacentElements(arrExample);
        Arrays.stream(res).forEach(System.out::print);
    }
    static int[] arrayDontAdjacentElements(int arr[]){
        return IntStream.range(0,arr.length).filter(i->i==0 || arr[i]!=arr[i-1]).map(i->arr[i]).toArray();
    }
}
