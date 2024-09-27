package org.example.oops.abstraction;

public class MainClass1
{
    public static void main(String[] args)
    {
        NormalClass normalClass = new NormalClass();
        System.out.println(normalClass.sum(10,6));
        // abstraction 
        AbstractClass1 abstractClass1 = new NormalClass();
        System.out.println(abstractClass1.sum(10,5));
    }
}
