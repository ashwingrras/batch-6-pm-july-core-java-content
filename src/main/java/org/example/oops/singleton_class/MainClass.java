package org.example.oops.singleton_class;

public class MainClass
{
    public static void main(String[] args)
    {
        /*
        SingletonClass singletonClass1 = new SingletonClass();
        SingletonClass singletonClass2 = new SingletonClass();
        SingletonClass singletonClass3 = new SingletonClass();
        System.out.println(singletonClass1);
        System.out.println(singletonClass2);
        System.out.println(singletonClass3);
        */
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        SingletonClass singletonClass2 = SingletonClass.getInstance();
        SingletonClass singletonClass3 = SingletonClass.getInstance();
        System.out.println(singletonClass1);
        System.out.println(singletonClass2);
        System.out.println(singletonClass3);
        System.out.println(singletonClass1.sum(10,5));
        singletonClass1.printCounter();
        singletonClass1.printCounter();
        singletonClass1.printCounter();
        singletonClass1.printCounter();
        singletonClass1.printCounter();
        System.out.println(SingletonClass.instance2);
        System.out.println(SingletonClass.instance2);
    }



}
