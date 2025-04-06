package leetcode.programmingSkills;

import java.util.HashMap;
import java.util.stream.IntStream;

public class MergeStringsAlternately {


    public static void main(String[] args) {
        String word1 = "13579";
        String word2 = "24681011";
        /*int w1Lenght=word1.length(),w2Lenght=word2.length();
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append(word1.substring(5)));
        if (w1Lenght==w2Lenght){
            IntStream.range(0,word1.length()).forEach(el-> stringBuilder.append(word1.charAt(el)).append(word2.charAt(el)));
        } else if (w1Lenght>w2Lenght) {
            IntStream.range(0,word2.length()).forEach(el-> stringBuilder.append(word1.charAt(el)).append(word2.charAt(el)));
            stringBuilder.append(word1.substring(w2Lenght));
        }
        else if (w2Lenght>w1Lenght)
        {
            IntStream.range(0,word1.length()).forEach(el-> stringBuilder.append(word1.charAt(el)).append(word2.charAt(el)));
            stringBuilder.append(word2.substring(w1Lenght));
        }*/
        //mergeValue("","");
        //String merge= new MergeStringsAlternately().mergeAlternately("","");


    }

    public String mergeAlternately(String word1, String word2) {
        int w1Lenght = word1.length(), w2Lenght = word2.length();
        StringBuilder stringBuilder = new StringBuilder();
        if (!word1.isEmpty() && !word2.isEmpty()) {
            if (w1Lenght == w2Lenght) {
                IntStream.range(0, word1.length()).forEach(el -> stringBuilder.append(word1.charAt(el)).append(word2.charAt(el)));
            } else if (w1Lenght > w2Lenght) {
                IntStream.range(0, word2.length()).forEach(el -> stringBuilder.append(word1.charAt(el)).append(word2.charAt(el)));
                stringBuilder.append(word1.substring(w2Lenght));
            } else if (w2Lenght > w1Lenght) {
                IntStream.range(0, word1.length()).forEach(el -> stringBuilder.append(word1.charAt(el)).append(word2.charAt(el)));
                stringBuilder.append(word2.substring(w1Lenght));
            }
        } else throw new RuntimeException("value isEmpty");

        return stringBuilder.toString();
    }




}

