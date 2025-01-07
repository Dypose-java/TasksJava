package code_me.level_7_2;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Task1 {
    /**Сделайте метод, который параметром будет принимать число и удалять из него нули.*/
    public static void main(String[] args) {
        delZeroInNum(52021210);
        System.out.println(delZeroInNum(1020304405));
    }
    static long delZeroInNum(long num){
        String resStr= Arrays.stream(String.valueOf(num).split("")).filter(el->!el.equals("0")).collect(Collectors.joining(""));
        return Long.parseLong(resStr);
    }
}
