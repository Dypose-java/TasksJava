package code_me.habr;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@DisplayName("https://habr.com/ru/articles/440436/#10")
public class Main {
    @Test
    void basics(){
        List<Integer> list = IntStream.rangeClosed(0,10).map(el->new Random().nextInt(100)).boxed().toList();
        System.out.println(list);
        System.out.println("min:"+list.stream().min(Integer::compare).get());
        System.out.println("max:"+list.stream().max(Comparator.naturalOrder()).get());

    }
    @Test
    void basic12(){
        List<Integer> list = IntStream.rangeClosed(0,100).boxed().toList();
      list.stream().filter(Main::isPrime).forEach(System.out::println);


    }
    static boolean isPrime(int num){
        return num>1&& IntStream.rangeClosed(2, (int) Math.sqrt(num)).allMatch(el->num%el!=0);
    }
    @Test
    void basic13(){
        List<Integer> list = delElFromList(List.of(1, 1, 1, 1, 1, 3, 4, 5), 1);
        System.out.println(list);
    }
    static List<Integer> delElFromList(List<Integer> list,int delNum){
        return list.stream().filter(el->el!=delNum).toList();
    }

}

class SolutionTask1 {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1}; // Если решения нет
    }
    public static void main(String[] args) {
       int arr[] ={1,2,3,4,5,6,7};



    }
}
class test{
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list1.add(2);
        list1.add(4);
        list1.add(3);

        list2.add(5);
        list2.add(6);
        list2.add(4);
        Collections.reverse(list1);
        Collections.reverse(list2);
        int valueList1 = Integer.parseInt(list1.stream().map(String::valueOf).collect(Collectors.joining()));
        int valueList2 = Integer.parseInt(list2.stream().map(String::valueOf).collect(Collectors.joining()));
        String string = new StringBuilder(String.valueOf((valueList1+valueList2))).reverse().toString();
        LinkedList<Integer> listRes = new LinkedList<>();
        for (String fdfd:string.split("")){
           listRes.add(Integer.valueOf(fdfd));
        }
        System.out.println();


    }
}
