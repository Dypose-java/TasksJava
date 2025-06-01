public class FirstIndexOccurrenceInString {
    public static void main(String[] args) {
        int i = firstIndexOccurrenceInString("sadbutsad", "sads");
    }
    public static int firstIndexOccurrenceInString(String str1,String str2){
       return str1.indexOf(str2);
    }
}
