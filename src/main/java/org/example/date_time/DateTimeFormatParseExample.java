package org.example.date_time;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormatParseExample
{
    public static void main(String[] args) {
        String dob =  "14/10/1991";
        String dobPattern = "dd/MM/yyyy";
        SimpleDateFormat dateFormatDob = new SimpleDateFormat(dobPattern);
        try
        {
            Date parsedDateDob = dateFormatDob.parse(dob);
            System.out.println("Parsed DOB Date: " + parsedDateDob);
        } catch (ParseException e)
        {
            System.err.println("Error parsing date-time string: " + e.getMessage());
        }
    }

}
