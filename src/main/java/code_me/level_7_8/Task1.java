package code_me.level_7_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1 {
    /**Сделайте метод, который параметром будет принимать массив и возвращать случайный элемент этого массива.
     */
    public static void main(String[] args) {
        List<String> list = List.of("aby","bandit","1337","228");
        System.out.println(getRandElementArrays(list));
        List<Integer> integerList = List.of(1,2,5,3,4423,42,231,13,131,54,6,67,7698,52);
        System.out.println(getRandElementArrays(integerList));
    }

    static <T> T getRandElementArrays(List<T> list){
        if (!list.isEmpty()||list==null){
            return list.get(new Random().nextInt(list.size()));
        }
        return (T) list;
    }
}
