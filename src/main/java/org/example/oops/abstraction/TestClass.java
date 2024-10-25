package org.example.oops.abstraction;

public class TestClass implements TestInterface
{

    //@Override
    public void show2()
    {
        System.out.println("at TestClass show method");
    }

    @Override
    public int sumOfTwo(int a, int b) {
        return 0;
    }

    @Override
    public int sumOfTwo(int a, int b, int c) {
        return 0;
    }
}
