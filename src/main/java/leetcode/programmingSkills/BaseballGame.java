package leetcode.programmingSkills;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {
    public static void main(String[] args) {
        String s[]={"5","2","C","D","+"};
        int i = calPoints(s);

    }

    public static int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        for (String el:operations){

            switch (el){
                case "C":
                    if (!list.isEmpty()){
                        list.remove(list.size()-1);
                    }
                    break;
                case "D":
                    if (!list.isEmpty()){
                        list.add((
                                list.get(list.size()-1)*2
                        ));
                    }
                    break;
                case "+":
                    if (!list.isEmpty()){
                        int i = list.get(list.size() - 1) + list.get(list.size() - 2);
                        list.add(i);

                    }
                    break;
                default:list.add(Integer.parseInt(el));
            }
        }
        return list.stream().mapToInt(Integer::intValue).sum();
    }
}
