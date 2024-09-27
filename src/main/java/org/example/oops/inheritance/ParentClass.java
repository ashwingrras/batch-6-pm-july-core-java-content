package org.example.oops.inheritance;

public class ParentClass extends GrandParent
{
    int a = 15;

     public ParentClass()
    {
        System.out.println(" at ParentClass constructor ");
    }

    public int sum(int a, int b)
    {
        System.out.println(" at parent class sum method ");
        return a * b;
    }

    public int multiply(int a, int b)
    {
        System.out.println("at parent class multiply method");
        return a * b;
    }

    public void callParentMethod()
    {
        sum(10,5);
    }
}
