package code_me.level_7_7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.IntStream;

public class Task4 {
    /**Сделайте метод, который параметром будет принимать массив и возвращать новый массив,
     * в котором будут удалены все дубли, которые встречаются больше трех раз.
     */
    public static void main(String[] args) {
List<Integer> list= List.of(1,1,1,1,1,1,2,2,2,3,4,5,6,7,8);
delDuplicatesMoreThree(list);
    }
    static void delDuplicatesMoreThree(List<Integer> inputList){
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : inputList) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        System.out.println("log:"+hashMap);
        List<Integer> result = new ArrayList<>();
        for (int num:inputList){
            if (hashMap.get(num)<=3){
                result.add(num);
            }

        }
        System.out.println("res:"+result);
    }

}
