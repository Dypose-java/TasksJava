package testAll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomChar {
    public static void main(String[] args) {
        System.out.println(randGenerate(20));
    }




    static void addAlphabetFromBToZ(List<String> list){
        char el ='a';
        while (true){
            el++;
            list.add(String.valueOf(el));
            if (String.valueOf(el).equals("z"))
                break;
        }
    }
    static String randGenerate(int size){
        List<String> list = new ArrayList<>();
        addAlphabetFromBToZ(list);
        StringBuilder stringBuilder = new StringBuilder();
        if (list.size()<size){
            System.out.printf("Введите число рандомной генерации до:%d",list.size());
        }else {
            stringBuilder.append(IntStream.range(0,size).mapToObj(el -> list.get(new Random().nextInt(list.size()))).collect(Collectors.joining("")));
        }
        return stringBuilder.toString();
    }
}
