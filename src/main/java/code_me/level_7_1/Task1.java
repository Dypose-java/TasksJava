package code_me.level_7_1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(getCurrentDayOfWeek());
    }
    static String getCurrentDayOfWeek(){
        LocalDate localDate = LocalDate.now();
        return String.valueOf(localDate.getDayOfWeek());
    }
}
