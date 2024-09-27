package org.example.oops.inheritance;

import java.util.Scanner;

public class MainClassExample1
{
    public static void main(String[] args)
    {
        System.out.println("inside MainClassExample1 example");
        //ParentClass parentClass = new ParentClass();

        Scanner scanner = new Scanner(System.in);
        System.out.println(" please enter value ");
        String value = scanner.next();
        System.out.println("entered  value "+value);
        ChildClass childClass = new ChildClass();
        childClass.sum(10,5);

        /*
        ParentClass parentClass = new ChildClass();
        System.out.println(parentClass.sum(10,5));
        System.out.println(parentClass.multiply(5,6));
        */

    }
}
