package code_me.level_7_5;

public class Task2 {
    /**Дана переменная со строкой. Проверьте, что в эта строка представляет собой дробь.*/
    public static void main(String[] args) {
        System.out.println(isStrDouble("5.4"));
    }static boolean isStrDouble(String str){
        try {
           Double.parseDouble(str);
           str.contains(".");
           return true;
        } catch (Exception e) {
            return false;
        }
    }
}
