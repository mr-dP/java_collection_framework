/*
 *  -> We have different classes available for Date and Time separately
 *  -> Represent the time in the form of 2 variables - seconds and nanoseconds since JAn 1 1970
 *  -> These classes are Immutable. Whenever you are changing you will get a new object of the type
*/

import java.util.Date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Clock;
import java.time.ZoneId;
import java.time.Month;


class JodaDateTime {
  public static void main(String[] args) {

    Date date = new Date();
    System.out.println(date);    //    Thu Sep 03 10:52:35 IST 2020
    date.setHours(15);           //    (MUTABLE)
    System.out.println(date);    //    Thu Sep 03 15:52:35 IST 2020

    LocalDate localDate = LocalDate.now();    //    current date
    System.out.println(localDate);            //    2020-09-03

    LocalDate localDate2 = LocalDate.now(Clock.systemDefaultZone());
    System.out.println(localDate2);           //    2020-09-03

    LocalDate localDate3 = LocalDate.now(ZoneId.of("America/Costa_Rica"));
    System.out.println(localDate3);           //    2020-09-02

    LocalDate localDate4 = LocalDate.of(2010, Month.JULY, 18);
    System.out.println(localDate4);           //    2010-07-18

    LocalDate localDate5 = LocalDate.ofEpochDay(2000);    //    2000 Days from Epoch Day
    System.out.println(localDate5);           //    1975-06-24

    LocalDate localDate6 = LocalDate.parse("2019-05-28");
    System.out.println(localDate6);           //    2019-05-28

    LocalDate localDate7 = LocalDate.parse("2019-05-28");
    localDate7.plusMonths(8);
    System.out.println(localDate7);           //    2019-05-28
    LocalDate dt = localDate7.plusMonths(8);
    System.out.println(dt);                   //    2020-01-28


    LocalTime localTime = LocalTime.now();
    System.out.println(localTime);            //    11:16:39.250
    localTime.minusHours(5);
    System.out.println(localTime);            //    11:16:39.250

    LocalTime localTime2 = localTime.minusHours(5);
    System.out.println(localTime2);           //    06:18:06.031



    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);        //    2020-09-03T11:19:45.716

  }

}

// 1 Jan, 1970 is called as EPOCH Date
