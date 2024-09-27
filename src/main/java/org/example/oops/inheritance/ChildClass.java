package org.example.oops.inheritance;

public class ChildClass extends ParentClass
{

    int b = 10;
    ChildClass()
    {
        System.out.println(" at ChildClass constructor");
        //System.out.println(a);

    }



    public int divide(int a, int b)
    {
        System.out.println(" at child class divide method ");
        return a / b;
    }

    public void callParentMethod()
    {
        sum(10,5);
    }


    public int sum(int a, int b)
    {
        System.out.println(" at child class sum method ****** ");
        return a + b;
    }


}
