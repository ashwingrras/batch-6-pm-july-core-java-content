package org.example.oops.inheritance;

public class GrandParent
{
    int g = 78;

    int b = 3333;

    public GrandParent()
    {
        System.out.println(" at GrandParent constructor");
    }

    public int modulus(int a, int b)
    {
        System.out.println(" at GrandParent modulous sum method ");
        return  a % b;
    }

    public int sum(int a, int b)
    {
        System.out.println(" at GrandParent class sum method ");
        return a * b;
    }

}
