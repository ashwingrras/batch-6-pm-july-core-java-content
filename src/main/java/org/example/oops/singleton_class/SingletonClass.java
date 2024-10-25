package org.example.oops.singleton_class;

public class SingletonClass
{
    int count = 0;
    static SingletonClass instance;

    //private static final SingletonClass instance = new SingletonClass();
    static final SingletonClass instance2 = new SingletonClass();

    private SingletonClass()
    {
        System.out.println(" SingletonClass constructor ");
    }

    public static SingletonClass getInstance()
    {
        ////instance = new SingletonClass();
        if(null == instance)
        {
            instance = new SingletonClass();
        }
        return instance;
    }


    public int sum(int a, int b)
    {
        return a + b;
    }

    public void printCounter()
    {
        System.out.println(count++);
    }

}
