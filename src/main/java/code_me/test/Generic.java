package code_me.test;

import java.util.ArrayList;
import java.util.List;

public class Generic <T extends Integer> {
    List<T> list;
    public Generic(List<T> list) {
        this.list = list;
    }
    public void fsdfs(){
    }

    }
class test{
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5);
        List<String> liststr = new ArrayList<>();
        Generic generic = new Generic<>(list);

        System.out.println(list.stream().mapToInt(Integer::intValue).sum());
        System.out.println(list.stream().reduce((x,y)->x*y).get());



    }
}