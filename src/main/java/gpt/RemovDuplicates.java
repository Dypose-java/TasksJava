package gpt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemovDuplicates {
    public static void main(String[] args) {
        List<String> list = List.of("str1","str2","str1","s","s","a");
        System.out.println(removeDuplicates(list));


    }
    public static List<String> removeDuplicates(List<String> list){

      return new HashSet<>(list).stream().toList();
    }
}
