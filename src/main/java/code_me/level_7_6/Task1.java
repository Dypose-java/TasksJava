package code_me.level_7_6;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(strRand(10));
    }

    static String strRand(int length){
        StringBuilder stringBuilder = new StringBuilder();
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        stringBuilder.append(IntStream.range(0,length)
                .mapToObj(el->chars.charAt(new Random().nextInt(chars.length())))
                .map(String::valueOf).collect(Collectors.joining("")));
        return stringBuilder.toString();
    }

}
