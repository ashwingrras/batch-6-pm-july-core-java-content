package org.example.oops.inheritance;

import java.util.Arrays;
import java.util.Scanner;

/*

    1. class
    2. object
    3. constructor: default, parametrized, copy
    4. inheritance : single, multi level, Hierarchical , hybrid ( inheritance +  interface )
    5. Polymorphism: method overloading, method overriding
    6. abstraction : abstract class and method, interface
    7. aggregation
    8. encapsulation


 */

public class MainClassExample1
{
    int no = 6;
    public static void main(String ...a)
    {
        System.out.println("inside MainClassExample1 example");
        //ParentClass parentClass = new ParentClass();
        ChildClass childClass = new ChildClass(); // child, parent, grandparent
        childClass.callParentMethod();
        /*childClass.sum(10,5);
        childClass.multiply(10,2);
        childClass.modulus(10,3);
        childClass.callParentMethod();*/
        //
        //((ParentClass)childClass).sum(18,2);
        //((GrandParent)childClass).sum(18,2);



        /*
        ParentClass parentClass = new ChildClass();
        System.out.println(parentClass.sum(10,5));
        System.out.println(parentClass.multiply(5,6));
        */
        // TODO varargs, new feature of java
        /*
        int[] array =  add(10,20,20,50);
        System.out.println(Arrays.toString(array));
        */
    }

    /*
    static int[] add(int ...b) // varargs
    {
        System.out.println("inside add, b"+b);
        System.out.println(Arrays.toString(b));
        return  b;
    }
    */
    void getTestDefaultMethod()
    {

    }

}
