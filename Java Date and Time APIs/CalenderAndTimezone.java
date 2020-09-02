// -> Calender is an Abstract Class because there are there various Calenders followed in the world
// -> There is a class available for Gregorian calendar (globally followed calender) in Java

import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.TimeZone;

class CalenderAndTimezone {

  public static void main(String[] args) {

    GregorianCalendar gCalendar = new GregorianCalendar();

    System.out.println(gCalendar);
    System.out.println(gCalendar.isLeapYear(2020));
    System.out.println(gCalendar.get(Calendar.DATE));
    System.out.println(gCalendar.get(Calendar.MONTH));    //    MONTH will start from 0 onwards
    System.out.println(gCalendar.get(Calendar.DAY_OF_WEEK));    //    DAY_OF_WEEK will start from 1 onwards
    System.out.println(gCalendar.get(Calendar.DAY_OF_YEAR));

    TimeZone tZone = gCalendar.getTimeZone();
    System.out.println(tZone);
    System.out.println(tZone.getDisplayName());
    System.out.println(tZone.getID());

    gCalendar.setTimeZone(TimeZone.getTimeZone("Australia/Perth"));
    TimeZone tZone2 = gCalendar.getTimeZone();
    System.out.println(tZone2.getDisplayName());
    System.out.println(tZone2.getID());

  }

}
