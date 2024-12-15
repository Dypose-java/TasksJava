package code_me.level_7_1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(getDayOfWeekFromDate("52-5212"));
    }
    static String getDayOfWeekFromDate(String date){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            dateFormat.parse(date);
        } catch (ParseException e) {
            return "Date not current.Formate date(yyyy-MM-dd)";
        }
        LocalDate localDate =LocalDate.parse(date);
        return String.valueOf(localDate.getDayOfWeek());
    }
}
