package code_me.level_7_6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task3 {
    /**Метод принимает число а на выходе возвращает массив всех делителей этого числа*/
    public static void main(String[] args) {
        System.out.println(arraysВivisorsFromNum(10));
    }
    static List<Integer> arraysВivisorsFromNum(int num){
  return IntStream.rangeClosed(1,num).filter(el->num%el==0).boxed().toList();
    }
}
