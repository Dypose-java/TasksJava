package code_me.level_7_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task2 {
/**Сделайте метод, который параметром будет принимать массив и возвращать массив из N случайных элементов этого массива.
 * */
public static void main(String[] args) {
List<Integer> list = List.of(1,2,3,4,5,6,7);
    System.out.println(arraysRandElementFromInputArray(list,3));
}
static <T> List<T> arraysRandElementFromInputArray(List<T>list,int numN){
    List<T> list1 = new ArrayList<>(list);
    Collections.shuffle(list1,new Random());
    System.out.println(list1);
    return list1.stream().limit(numN).toList();

}
}
