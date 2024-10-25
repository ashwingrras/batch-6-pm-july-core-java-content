package org.example.exception_handling;

import java.io.*;
import java.net.SocketException;
import java.sql.SQLException;
import java.util.Date;

/*

        checked exception
        1. FileNotFound
        2. SQLException
        3. InterruptedException
        4. SocketException

        unchecked exception
        1. Arithmetic
        2. ArrayIndex
        3. NullPointer
        4. NumberFormat


 */

public class Example1
{
    public static void main(String[] args) {
        System.out.println(" first example ");
        int divide = 10 / 5; // runtime exception , unchecked exception
        System.out.println(" divide = "+divide);
        //InputStream inputStreamOut = new FileInputStream("myfile.java");
        try
        {
            // checked / compile time / unhandled exception
            InputStream inputStream = new FileInputStream("myfile.java");
        }
        /*catch (Exception e)
        {

        }*/
        catch (ArithmeticException | FileNotFoundException e)
        {
            //e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        /*catch (FileNotFoundException e)
        {
            //e.printStackTrace();
        }*/
        int divideResult = -1; //= divide(10, 0);
        try
        {
            divideResult = divide(10, 5);
        }
        catch (Exception e)
        {
            System.out.println("error message = " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println(divideResult);
        try
        {
            //testFile();
        }
        catch (Exception e)
        {

        }
        System.out.println(" end of main method ");
        for(int i = 0 ; i < 10; i++)
        {
            System.out.println(i);
        }

        System.out.println(" ************ ");
        try

        {
            testMethod1();
        }
        catch (Exception e)
        {
            System.out.println(" exception &&&&& = "+e.getMessage());
        }
        System.out.println(" ************ ");
        testFinallyMethod();
        System.out.println(" before testThrow ");
        try
        {
            testThrow();
        }
        catch (Exception e)
        {
            System.out.println("exception "+e.getMessage());
        }
        System.out.println("after testThrow");
    }

    public static int divide(int a, int b)
    {
        int result = -1;
        result = a / b;
        /*try
        {
          result = a / b;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }*/
        return result;


    }

    public static void testTryAsMethod()
    {
        // NEW way
        try (
                FileInputStream fileInputStream1 = new FileInputStream("")
                )
        //try
        {
            // old way
            FileInputStream fileInputStream = new FileInputStream("");
            System.out.println(fileInputStream);
        }
        catch (Exception e)
        {

        }


    }

    public static void testFile() throws FileNotFoundException, ArithmeticException
    {
        FileInputStream fileInputStream = new FileInputStream("test.java");
        throw new ArithmeticException();
    }


    public static void testMethod1() throws FileNotFoundException
    {
        System.out.println(" at testMethod1 ");
        testMethod2();
        //FileInputStream fileInputStream = new FileInputStream("test.java");
    }


    public static void testMethod2() //throws FileNotFoundException
    {
        System.out.println(" at testMethod2 ");

        try {
            testMethod3();
        }
        catch (Exception e)
        {
            System.out.println(" at method2 exception = "+e.getMessage());
        }

        //FileInputStream fileInputStream = new FileInputStream("test.java");
    }

    public static void testMethod3() throws SQLException
    {
        System.out.println(" at testMethod3 ");
        try {
            FileInputStream fileInputStream = new FileInputStream("test.java");
        }
        catch (Exception e)
        {
            //
        }

        System.out.println(" end of method ");
    }


    public static void testFinallyMethod()
    {
        System.out.println(" inside testFinallyMethod ");
        Date startDate = new Date();
        try
        {
            System.out.println(" startDate "+startDate);
            int sum = 0;
            for(int i =0; i < 100000000; i++)
            {
                sum++;
            }
            int divide = 10 / 2;
            //FileInputStream fileInputStream = new FileInputStream("test.java");
            System.out.println(" sum = " +sum);

            System.out.println(" divide = "+divide);

            Date endData = new Date();
            System.out.println(" endData "+endData);

            saveUserActivity();
            //
        }
        catch (ArithmeticException e)
        {
            System.out.println(" exception = "+e.getMessage());
            //saveUserActivity();
        } finally
        {
            System.out.println(" inside finally block ");
            saveUserActivity();
        }


    }

    public static void saveUserActivity()
    {
        System.out.println(" inside saveUserActivity method ");
    }

    public static void testThrow()
    {
        int age = 10;
        if(age < 18)
        {
            throw new ArithmeticException("age below 18");
        }
        try
        {
            if(age < 18)
            {
                //throw new FileNotFoundException("age below 18");
            }
        }
        catch (NullPointerException e)
        {
            System.out.println(" testThrow method catch "+e.getMessage());
        }


    }


}
