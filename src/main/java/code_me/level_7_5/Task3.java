package code_me.level_7_5;

import java.util.List;

public class Task3 {
    /**Сделайте метод, который параметром будет принимать массив с числами и возвращать второе по величине число.*/
    public static void main(String[] args) {
List<Integer> list = List.of(1,3,5,6,7,8,9,51,52);
        System.out.println(maxSecondNum(list));
    }
    static int maxSecondNum(List<Integer> list){
        return list.stream().sorted((a,b)->b-a).skip(1).findFirst().get();
    }
}
