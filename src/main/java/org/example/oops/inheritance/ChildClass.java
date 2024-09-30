package org.example.oops.inheritance;

public class ChildClass extends ParentClass
{
    int b = 1111;
    ChildClass()
    {
        System.out.println(" at ChildClass constructor");
        //System.out.println(a);
        //modulus(10,2);

    }

    public int divide(int a, int b)
    {
        System.out.println(" at child class divide method ");
        return a / b;
    }

    public void callParentMethod()
    {
        System.out.println(a);
        System.out.println(super.a);
        System.out.println(b);
        System.out.println(super.b);
        System.out.println(this.b);
        double d = 10; // implicit
        int a = (int) 15.15; // explicit
        System.out.println(((GrandParent)this).b);
        System.out.println(((GrandParent)this).sum(3,3));
        super.sum(10,5);
    }


    public int sum(int a, int b)
    {
        super.sum(10,4);
        System.out.println(" at child class sum method ****** ");
        return a + b;
    }


}
