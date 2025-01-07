package code_me.Level_7_3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task1 {
    /**Сделайте метод, который параметром будет принимать массив и возвращать новый массив, не содержащий дубли элементов.*/
    public static void main(String[] args) {
        int example[]={1,1,1,1,1,2,2,3,4,5,6,7,8};
        int res[] =arraysDontduplicate(example);
        Arrays.stream(res).forEach(el-> System.out.print(el+" "));
    }
    static int[] arraysDontduplicate(int[] arr){
        Set<Object> set = new HashSet<>();
        Arrays.stream(arr).forEach(set::add);
        Integer resArr[] =set.toArray(Integer[]::new);
        return Arrays.stream(resArr).mapToInt(Integer::intValue).toArray();
    }
}
