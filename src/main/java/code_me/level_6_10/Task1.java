package code_me.level_6_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1 {
    /**
     * Заполните массив случайными числами из промежутка от 1 до 100.
     */
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i =1;i<=100;i++){
            list.add(new Random().nextInt(100000));
        }
        list.stream().map(String::valueOf).map(el->(list.indexOf(Integer.parseInt(el))+1)+", "+el).forEach(System.out::println);

/**
 * Метод indexOf возвращает индекс первого вхождения элемента в списке. Если в списке есть повторяющиеся значения,
 * то для всех таких значений будет возвращен один и тот же индекс (индекс первого появления элемента).
 * Поэтому индексы выводятся "в разнобой".
 */
    }

}
