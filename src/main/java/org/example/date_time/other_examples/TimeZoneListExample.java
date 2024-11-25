package org.example.date_time.other_examples;

import java.util.TimeZone;

public class TimeZoneListExample {
    public static void main( String[] args)
    {
        String[] id = TimeZone.getAvailableIDs();
        System.out.println("TimeZone as : ");
        System.out.println(" timezones count "+id.length);
        for (String s : id)
        {
            System.out.println(s);
        }
    }
}
