package org.example.scanner_class;

import java.util.Scanner;

public class ScannerClassExample2
{
    public static void main(String[] args)
    {
        Scanner scanner  = new Scanner(System.in);
        System.out.println(" please enter value");
        scanner.useDelimiter(",");
        String value = scanner.next();
        System.out.println("entered value: "+value);
        scanner.useDelimiter("_");
        System.out.println(" please enter value");
        value = scanner.next();
        System.out.println("value1: "+value);
    }
}
