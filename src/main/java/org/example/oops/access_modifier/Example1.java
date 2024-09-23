package org.example.oops.access_modifier;

/*
    Access Modifier
    1. public : allow access on whole project
    2. private : allow only inside class
    3. default : allow on same package
    4. protected: allow on same package but also allow on different package with relation


 */

import org.example.oops.OopsExample1;

public class Example1
{
    int a = 10;
    static int b = 5;
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
    }
}

class SubClassExample1
{
    public int a = 10;
    protected int b = 16;
    int d = 6;
    private int c = 6;

     int sum(int a, int b)
    {
        return a + b;
    }

    int multiply()
    {
        return a * c;
    }


}