package org.example.date_time;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeWithZoneExample
{
    public static void main(String[] args)
    {
        ZonedDateTime currentDateTime = ZonedDateTime.now();
        System.out.println("zone currentDateTime "+currentDateTime);
        System.out.println("Current Date and Time: " + currentDateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));


        ZonedDateTime newYorkDateTime = currentDateTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("Date and Time in New York: " + newYorkDateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));

        ZoneId zoneId = ZoneId.of("Asia/Karachi");
        ZonedDateTime tokyoDateTime = currentDateTime.withZoneSameInstant(zoneId);
        System.out.println("Date and Time in: " + tokyoDateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));

    }
}
