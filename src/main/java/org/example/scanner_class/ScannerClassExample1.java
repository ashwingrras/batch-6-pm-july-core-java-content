package org.example.scanner_class;

import java.util.Scanner;

public class ScannerClassExample1 
{
 
    public static void main(String[] args) 
    {
        // vikash jangid
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.println("please enter value");
        String outsideValue = scanner.next();
        System.out.println("outside value: "+outsideValue);
        
        System.out.println("please enter new value");
        String outsideLine = scanner.nextLine();
        System.out.println("outsideLine value: "+outsideLine);
        */
        System.out.println("please enter value");
        if (scanner.hasNextInt()) 
        {
            int enteredValue = scanner.nextInt();
            for (int i =1; i <= enteredValue; i++) 
            {
                    System.out.println(i);
            }    
        }
        else
        {
            System.out.println("please enter number value");
        }
    }
}
