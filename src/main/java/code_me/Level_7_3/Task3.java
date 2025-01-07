package code_me.Level_7_3;

import java.util.Arrays;

public class Task3 {
    /**Сделайте метод, который первым параметром будет
     * принимать целое число и возвращать количество его цифр, заданное вторым параметром.*/
    public static void main(String[] args) {
        int num =155664,searchNum =5;
        System.out.printf("число:%d,сумма сколько раз повторяется в числе цифра %d:%d"
                ,num,searchNum,sumNumSecondParam(num,searchNum));
    }
    static int sumNumSecondParam(int num,int searchNum){
        return (int) Arrays.stream(String.valueOf(num).split("")).filter(el->el.equals(String.valueOf(searchNum))).count();
    }
}
