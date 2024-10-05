package org.example.oops.access_modifier;

/*
    Access Modifier
    1. public : allow access on whole project
    2. private : allow only inside class
    3. default ( no name, label) : allow on same package
    4. protected: allow on same package but also allow on different package with relation



 */

import org.example.oops.OopsExample1;

public class Example1
{
    static SubClassExample1 subClassExample11 = new SubClassExample1();
    int a = 10;
    static int b = 5;  // 1234
    public static void main(String[] args)
    {
        SubClassExample1 subClassExample1 = new SubClassExample1();
        System.out.println(subClassExample1.sum(10,5));
        System.out.println(subClassExample1.a);
        System.out.println(subClassExample1.b);
        System.out.println(subClassExample1.d);
        System.out.println(subClassExample1.multiply());
        ///System.out.println(subClassExample1.c);

        ///////
        OopsExample1 oopsExample1 = new OopsExample1();
        oopsExample1.multiply();
        //oopsExample1.sum();
        Example2 example2 = new Example2();
        example2.sum();
        subClassExample1.sum(12,4);
        subClassExample11.nonStatic1();
        SubClassExample1 subClassExample12 = new SubClassExample1(); // 1122
        subClassExample12.nonStatic2();
        subClassExample12.checkNonStatic = 15;
        System.out.println(subClassExample12.checkNonStatic);
        subClassExample12.nonStatic2();
        SubClassExample1 subClassExample13 = new SubClassExample1(); // 1133
        System.out.println(" now using subClassExample13 ");
        subClassExample13.nonStatic2();
        //////
        System.out.println(SubClassExample1.checkStatic);
        SubClassExample1.static2();
        SubClassExample1.checkStatic = 25;
        System.out.println(SubClassExample1.checkStatic);
        SubClassExample1.static2();
    }

    public static void divide()
    {
        System.out.println("at sum method for testing");
        subClassExample11.nonStatic1();
    }

    public static void static1()
    {
        System.out.println("at static1 method for testing");
    }

    public static void static2()
    {
        System.out.println("at static2 method for testing");
    }

}

class SubClassExample1
{
    // constructor
    protected SubClassExample1()
    {
        System.out.println("at SubClassExample1 constructor ******* ");
    }

    public int a = 10;
    protected int b = 16;
    int d = 6;
    private int c = 6;

    int checkNonStatic = 10;

    static int checkStatic = 20;

     protected int sum(int a, int b)
    {
        return a + b;
    }


    public static void sum()
    {
        System.out.println("at sum method for testing");
    }

    int multiply()
    {
        return a * c;
    }

    public void nonStatic1()
    {

    }

     public void nonStatic2()
    {
        System.out.println("at nonStatic2");
        System.out.println(checkNonStatic);
    }

    static public void static2()
    {
        System.out.println("at static2");
        System.out.println(checkStatic);
    }

}