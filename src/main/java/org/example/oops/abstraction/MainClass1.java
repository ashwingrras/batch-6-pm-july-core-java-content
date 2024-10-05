package org.example.oops.abstraction;

public class MainClass1
{
    public static void main(String[] args)
    {
        /*NormalClass normalClass = new NormalClass();
        System.out.println(normalClass.sum(10,6));
        // abstraction 
        AbstractClass1 abstractClass1 = new NormalClass();
        System.out.println(abstractClass1.sum(10,5));*/

        /*TestInterface testClass = new TestInterface() {
            @Override
            public void show() {
                System.out.println("at annonyoumous class show method");
                //TestInterface.super.show();
            }
        };
        testClass.show();*/

        /*AbstractClass1 abstractClass1 = new NormalClass();
        System.out.println(abstractClass1.startPayment(101,"979960540", 100));*/

        ChildClassNonAbstract childClassNonAbstract = new ChildClassNonAbstract();
        System.out.println(childClassNonAbstract.sum(10,6));


    }
}
