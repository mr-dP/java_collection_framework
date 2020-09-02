// -> Date in Java is represented as a Long number
// -> The Long number will contain milliseconds past from 1st Jan 1970 till date
// -> Java follows the starting calender year as 1900

import java.util.Date;


class DateTimeJava1 {

  public static void main(String[] args) {

    System.out.println(System.currentTimeMillis());    //    1599060214798
    System.out.println(System.currentTimeMillis() / 1000 / 60 / 60 / 24 / 365);    //   years since 1 Jan 1970
    System.out.println(Long.MAX_VALUE);    //    9223372036854775807


    // java.util.Date
    Date d = new Date();    //    The Date Class is based on the milliseconds passed from Jan 1 1970
    System.out.println(d);

    Date d2 = new Date(System.currentTimeMillis());
    System.out.println(d2);

    Date d3 = new Date("1/2/1987");
    System.out.println(d3);    //    Fri Jan 02 00:00:00 IST 1987

    System.out.println(d.getTime());    //    1599061085954
    System.out.println(d.getDate());
    System.out.println(d.getDay());    //    Day of a week
    // Days of a week starts from 0
    // Sunday = 0; Monday = 1; ...
    System.out.println(d.getMonth());
    // Months starts from 0
    // January = 0; February = 1; ...
    System.out.println(d.getYear());    //    120 -> Number of years passed since 1900
    // The calender follows starting year as 1900
    System.out.println(d.getYear() + 1900);

  }

}
