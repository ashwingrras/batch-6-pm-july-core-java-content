package org.example.oops.inner_class;


interface DisplayableInterface {
    void display();
}

class DisplayableClass {
    void display()
    {
        System.out.println("at display DisplayableClass, outer");
    }
}


public class InnerClassParentExample1
{
    Object object = new Object();
    int a = 10; // non-static
    int b = 8;
    static int c = 4;
    InnerClassParentExample1()
    {
        System.out.println(" InnerClassParentExample1 constructor");
        InnerClass1 object1 = new InnerClass1();
        System.out.println(" end of constructor");
        outerMethod();
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
            System.out.println("c "+v);
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


    void outerMethod()
    {
        final int localVar = 10;
        a = 18;
        c = 19;
        class Local
        {
            int id = 100;
            void display()
            {
                System.out.println(" inside local method innerclass, display method");
                System.out.println("LocalVar: " + localVar);
                System.out.println(a);
                System.out.println(c);
                System.out.println(id);
                id = 190;
                System.out.println(id);
            }
        }
        Local local = new Local();
        local.display();
    }


    public Object outerMethodObject()
    {
        int localVar = 10;
        //localVar = 12;
        class Local extends DisplayableClass
        //class Local implements DisplayableInterface
        {
            @Override
            public void display()
            {
                System.out.println("inside local method inner class method call: " + localVar);
            }
        }
        return new Local();
    }

    int v = 9;

}
