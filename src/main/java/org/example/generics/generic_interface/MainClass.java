package org.example.generics.generic_interface;

public class MainClass
{
    public static void main(String[] args)
    {
        TestClass testClass = new TestClass();
        //System.out.println(testClass.sum(10,5));
        TestInterface<String> testInterface = new TestClass();
        System.out.println(testInterface.sum("1","1"));
    }
}
