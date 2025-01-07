package code_me.Level_7_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Task5 {
    /**Сделайте метод, который заполнит массив N случайными числами из заданного промежутка.*/
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        addRandNumFromArray(list,10);
        System.out.println(list);
        System.out.println(list.size());

    }static List<Integer> addRandNumFromArray(List<Integer> list,int capacity ){
        IntStream.rangeClosed(1,capacity).forEach(el->list.add(new Random().nextInt(capacity)));
        return list;
    }
}
