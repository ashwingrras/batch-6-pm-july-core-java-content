package org.example.multi_threading;

public class MainClassExample1
{
    public static void main(String[] args)
    {
        System.out.println("inside main method ");
        // First way: Thread Class extends
        /*
        Thread1WithExtends thread1WithExtends = new Thread1WithExtends();
        thread1WithExtends.start();
        for(int i =0; i < 100; i++)
        {
            //System.out.println(" i at main "+i);
        }
        System.out.println(" end of main method ");
        Thread1WithExtends thread2WithExtends = new Thread1WithExtends();
        thread2WithExtends.start();
        */

        // Second way: Runnable interface implements
        Thread1WithImplements thread1WithImplements = new Thread1WithImplements();
        //thread1WithImplements.run();

        Thread thread = new Thread(thread1WithImplements);
        thread.start(); //
        System.out.println(" end of main method ");

        // Third way: with lambda
        // Thread with lambda
        Thread thread1 = new Thread( () ->
        {
            System.out.println("inside lambda thread");
        });
        thread1.start();
    }
}
