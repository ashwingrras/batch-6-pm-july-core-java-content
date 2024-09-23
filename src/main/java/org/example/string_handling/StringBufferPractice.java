package org.example.string_handling;

/*
    String              : immutable
    StringBuffer        : mutable    ( thread unsafe )
    StringBuilder       : mutable    ( thread safe )
 */

import java.util.Date;

public class StringBufferPractice
{
    public static void main(String[] args)
    {
        //
        String name = "vijay"; // new object
        name = "vikash"; // new object
        StringBuffer stringBuffer = new StringBuffer(); // new object
        System.out.println(stringBuffer.capacity()); // default capacity: 16
        // if range exceed then it increase capacity as: (16 * 2) + 2
        stringBuffer.append("12345678912345678912345678912345678");
        System.out.println(stringBuffer.capacity()); // default capacity: 16
        stringBuffer.append("vijay");
        stringBuffer.append(", vikash");
        stringBuffer.append(", vakul");
        System.out.println("stringBuffer : "+stringBuffer);
        stringBuffer.insert(0," Mr. ");
        System.out.println("stringBuffer : "+stringBuffer);
        stringBuffer.delete(0,5);
        System.out.println("stringBuffer : "+stringBuffer);
        //TODO here converting StringBuffer to String
        String stringBufferToString = stringBuffer.toString();
        String testStr = ""+stringBuffer;
        System.out.println("testStr : "+testStr);
        System.out.println(testStr.getClass().getName());
        String no = ""+1;
        System.out.println(no);
        System.out.println(((Object)no).getClass().getSimpleName());

        System.out.println("now using StringBuffer");
        // Thread safe / synchronized
        StringBuffer stringBuffer1 = new StringBuffer();
        System.out.println("start: "+new Date());
        for(int i =0; i < 100000000; i++)
        {
            stringBuffer1.append(i);
            //
        }
        System.out.println("end : "+new Date());
        System.out.println(stringBuffer1.length());
        ////
        System.out.println("now using StringBuilder");
        // Thread unsafe / Non Synchronized
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println("start : "+new Date());
        for(int i =0; i < 100000000; i++)
        {
            stringBuilder.append(i);
            //
        }
        System.out.println("end: "+new Date());
        System.out.println(stringBuilder.length());


    }
}
