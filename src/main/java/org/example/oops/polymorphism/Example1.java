package org.example.oops.polymorphism;

/*

     polymorphism
     1. method overloading : same name different argument
        1.1 same class different method signature
        1.2 same method name but different argument / parameter
     2. method overriding : same name same argument on different class with relation
 */

public class Example1
{
    static Example1 example1 = new Example1();
    //Example1 example1 = new Example1();
    Example1()
    {
        System.out.println(" at constructor ");
    }
    public static void main(String[] args)
    {
        System.out.println(" at main method");
        Example1 example1 = new Example1();
        example1.sum(10,106.89);
    }

    public void vikash(int id, String name)
    {
        System.out.println(" at vikash method on Example1 class");
    }

    public int sum()
    {
        int sum = 10 + 5;
        return sum;
    }
    public int sum(int a)
    {
        int sum = a + 5;
        return sum;
    }

     int sum(int a, int b)
    {
        int sum = a + b;
        return sum;
    }

    double sum(double a, double b)
    {
        double sum = a + b;
        return sum;
    }
}
