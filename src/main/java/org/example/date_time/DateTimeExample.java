package org.example.date_time;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DateTimeExample
{
    public static void main(String[] args)
    {
        Date date = new Date(); // 22
        date.setDate(1); // 1
        date.setMonth(4); // april
        date.setYear(2023); // 2023

        System.out.println("start date " +date.getDate()+" "+date.getMonth()+" "+date.getYear());
        System.out.println(date);
        Instant instant = date.toInstant();
        System.out.println(System.currentTimeMillis());
        System.out.println(" instant "+instant.getNano());

        Date startDate = new Date();
        startDate.setDate(1); // 1
        startDate.setMonth(3); // april
        startDate.setYear(startDate.getYear() - 1); // 2023
        startDate.setHours(0);
        startDate.setMinutes(0);
        startDate.setSeconds(0);
        System.out.println(" startDate "+startDate);

        Date endDate = new Date();
        endDate.setDate(31); // 1
        endDate.setMonth(2); // march
        endDate.setHours(23);
        endDate.setMinutes(59);
        endDate.setSeconds(59);
        System.out.println(" endDate "+endDate);

        Date testDate = new Date();
        testDate.setTime(endDate.getTime()); // convert timestamp to date
        System.out.println(" test Date "+testDate);

        Calendar calendar1 = Calendar.getInstance();
        System.out.println("calendar "+calendar1);
        System.out.println(calendar1.getTime());
        calendar1.set(2023, 3, 1, 0, 0, 0);
        System.out.println(calendar1.getTime());
        Calendar calendar2 = Calendar.getInstance();
        System.out.println(calendar2.getTime());

        Date dateBefore1970 = new Date();
        dateBefore1970.setYear(1990);
        //System.out.println("dateBefore1970 = "+dateBefore1970);
        System.out.println("dateBefore1970 = "+dateBefore1970.getYear());

        Calendar calendar = Calendar.getInstance();
        System.out.println(" calendar "+calendar.getTime());
        calendar.set(1990,0,1);
        System.out.println(" calendar "+calendar.getTime());

        Object obj = "data";
        System.out.println(obj);

    }
}
