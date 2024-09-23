package org.example.oops;

public class OopsExample1
{
    int a = 10; //instance variable
    static int b = 5; // static variable
    public static void main(String[] args)
    {
        OopsExample1 oopsExample1 = new OopsExample1(); // new object
        System.out.println(oopsExample1.a);
        int a = 6; // local variable
        System.out.println(b);
        System.out.println(a);
        oopsExample1.sum();
    }


     void sum()
    {
        System.out.println(a);
        System.out.println(b);
        a = 7; // instance
        int a = 10; // local
        int b = 5;
        int sum = a + b;
        //multiply();
    }

    public void multiply()
    {
        int a = 10;
        int b = 5;
        int multiply = a * b;
        //divide();
    }

    public  static  void divide()
    {
        int a = 10;
        int b = 5;
        int divide = a / b;
    }

}
