package code_me.level_6_9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task3 {
    /**
     * Напишите код, который сравнит две приведенные ниже даты и выведет сообщение о том, какая из них больше:
     */
    public static void main(String[] args) {
        String date1Str = "2020-11-31";
        String date2Str = "2020-12-31";
isBigDate(date1Str,date2Str);

    }




    static void isBigDate(String date1,String date2){
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dateOne =LocalDate.parse(date1,dateFormat);
        LocalDate dateTwo =LocalDate.parse(date2,dateFormat);
        if (dateOne.isAfter(dateTwo))
            System.out.printf("%s > %s", dateOne, dateTwo);
        else if(dateOne.isBefore(dateTwo))
            System.out.printf("%s < %s", dateOne, dateTwo);
        else System.out.printf("%s = %s", dateOne, dateTwo);
    }
}
