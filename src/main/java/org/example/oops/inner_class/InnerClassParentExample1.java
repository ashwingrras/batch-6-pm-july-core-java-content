package org.example.oops.inner_class;

public class InnerClassParentExample1
{
    int a = 10; // non-static
     int b = 8;
    static int c = 4;
    InnerClassParentExample1()
    {
        System.out.println(" InnerClassParentExample1 constructor");
        InnerClass1 object1 = new InnerClass1();
        System.out.println(" end of constructor");
    }

    public class InnerClass1
    {
        int a = 5;
        InnerClass1()
        {
            System.out.println("InnerClass1 constructor");
            System.out.println(" b = "+b);
            System.out.println("a "+a);
            System.out.println("c "+c);
        }
    }

    static public class StaticInnerClass1
    {
        int a = 5;
        StaticInnerClass1()
        {
            System.out.println("StaticInnerClass1 constructor");
            //System.out.println(" b = "+b);
            System.out.println("a "+a);
            System.out.println("c "+c);
        }
    }


}
