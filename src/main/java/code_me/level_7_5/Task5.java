package code_me.level_7_5;

import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(randStr(4));


    }static String randStr(int length){
        char a ='a';
        StringBuilder strBild = new StringBuilder();

        for (int i = 0;i<=100;i++){
            a++;
            if (String.valueOf(a).equals("{")) break;
            else strBild.append(a);
        }
        String str =strBild.toString().toUpperCase(Locale.ROOT);
        strBild.append(str);

        StringBuilder res = new StringBuilder();
        List<String> list = List.of(strBild.toString().split(""));

          return IntStream.rangeClosed(1,length).mapToObj(el->list.get(new Random().nextInt(list.size()-1))).collect(Collectors.joining(""));

    }
}
