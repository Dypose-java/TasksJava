package code_me.level_7_1;

public class Task4 {
    /**
     Сделайте метод,
     который параметром будет принимать число и строку и обрезать эту строку до длины, заданной первым параметром.
     */
    public static void main(String[] args) {
        String text ="1234567890";
        setLengthText(5,text);
    }
    static void setLengthText(int length,String text) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= length - 1; i++)
            stringBuilder.append(text.charAt(i));
        System.out.println(stringBuilder);
    }
}
