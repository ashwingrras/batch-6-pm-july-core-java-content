package org.example.scanner_class;

import java.util.Scanner;

public class ScannerClassExample3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter values");
        String otp = "1234";
        String mobNo1 = "98989";
        String otp1 = "1234";
        String mobNo2 = "98989";
        String otp2 = "1234";
        int counter = 1;
        while(scanner.hasNext())
        {
            if(counter <= 3)
            {
                String value = scanner.next();
                if(value.equals(otp))
                {
                    System.out.println("otp is valid");
                    break;
                }
                else
                {
                    System.out.println("wrong otp");
                    counter++;
                }
            }
            else
            {
                System.out.println("you have entered wrong values more then 3 times");
                break;
            }
        }
    }
}
