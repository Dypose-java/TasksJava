package code_me.level_6_8;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Task1 {
   /**
    * Определите, сегодня выходной день или будний. Результат выведите в консоль.
    */
   public static void main(String[] args) {
      getWeekendOrWeekday();


   }
   public static void getWeekendOrWeekday(){
      Calendar calendar = new GregorianCalendar();
      DateFormat dateFormat1 = new SimpleDateFormat("u");
      int dayOfWeek = Integer.parseInt(dateFormat1.format(calendar.getTime()));
      if (dayOfWeek<=5)
         System.out.println("рабочий день");
      else System.out.println("выходной");
   }
}
