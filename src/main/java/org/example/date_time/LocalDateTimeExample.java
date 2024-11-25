package org.example.date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample
{
    public static void main(String[] args)
    {
        LocalDate localDate = LocalDate.now();
        System.out.println(" localDate "+localDate);
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.toEpochDay());
        System.out.println(localDate.lengthOfMonth());
        System.out.println(localDate.atStartOfDay());

        LocalTime localTime = LocalTime.now();
        System.out.println("localTime "+localTime);
        System.out.println(localTime.getNano());
        System.out.println("atDate: "+localTime.atDate(localDate));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(" localDateTime "+localDateTime);
        System.out.println(localDateTime.getMinute());

    }
}
