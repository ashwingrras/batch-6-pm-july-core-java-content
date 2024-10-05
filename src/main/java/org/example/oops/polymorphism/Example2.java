package org.example.oops.polymorphism;

public class Example2 extends Example1
{

    public void vikash(int id)
    {
        System.out.println(" at vikash method on Example2 class");
    }

    @Override
    public int sum()
    {
        int sum = 10 + 5;
        return sum;
    }
    @Override
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
