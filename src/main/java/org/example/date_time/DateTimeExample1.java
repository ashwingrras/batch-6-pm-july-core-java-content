package org.example.date_time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeExample1
{
    public static void main(String[] args)
    {
        Date date = new Date();
        System.out.println(" date : "+date);
        long timeStamp = date.getTime();
        System.out.println(" timestamp "+timeStamp);
        try {
        Thread.sleep(2000);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
            }
        Date date1 = new Date();
        System.out.println(" date1 : "+date1);
        System.out.println(" timestamp date1 "+date1.getTime());
        //System.out.println(System.currentTimeMillis());
        System.out.println(date.before(date1));
        System.out.println(date.after(date1));
        date1.setHours(14);
        date1.setMinutes(0);
        date1.setSeconds(0);
        date1.setMonth(date1.getMonth() - 1);
        //date1.setDate(32);
        System.out.println(" date1 : "+date1);
        System.out.println(" date ts : "+date1.getTime());
        System.out.println(date1.getHours());

        Date startDate = new Date(); //
        Date endDate = new Date(); //
        /*
            Task
            1. last month start date, end date
            2. last financial year date period: 1 april 2023 to 31 March 2024
            3. last week : 10 nov to 16 nov
            4. last year : 1 jan 2023 to 31 dec 2023

         */
        // Date format
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss a");

        String formattedDate = dateFormat.format(date1);
        System.out.println("Formatted Date: " + formattedDate);

    }
}
