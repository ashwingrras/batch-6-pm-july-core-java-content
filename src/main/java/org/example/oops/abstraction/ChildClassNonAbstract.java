package org.example.oops.abstraction;

public class ChildClassNonAbstract extends ParentAbstract implements TestInterface
{
    public ChildClassNonAbstract()
    {
        System.out.println(" ChildClassNonAbstract constructor ");
    }

    @Override
    public int sum(int a, int b) {
        System.out.println(" at sum method");
        return a +  b;
    }

    @Override
    public int multiply(int a, int b) {
        System.out.println(" at multiply method");
        return a * b;
    }

    @Override
    public int sumOfTwo(int a, int b) {
        return a + b;
    }

    @Override
    public int sumOfTwo(int a, int b, int c) {
        return 0;
    }
}
