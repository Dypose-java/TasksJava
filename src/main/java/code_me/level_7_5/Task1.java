package code_me.level_7_5;

public class Task1 {
    /**Дана переменная со строкой. Проверьте, что в эта строка представляет собой число, то есть состоит только из цифр.*/
    public static void main(String[] args) {
        System.out.println(numDontLetter("1234g"));
    }static boolean numDontLetter(String num){
        return num.matches("\\d+");
    }
}
