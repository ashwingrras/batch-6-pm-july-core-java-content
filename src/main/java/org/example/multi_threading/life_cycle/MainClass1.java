package org.example.multi_threading.life_cycle;

import java.util.Date;

public class MainClass1
{
    public static void main(String[] args)
    {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        System.out.println(" thread1,  main, 9 "+thread1.getState());
        System.out.println(" thread2,  main, 10 "+thread2.getState());
        thread1.start();
        thread2.start();
        try
        {
            System.out.println(" thread1, ------- "+thread1.getState());
            System.out.println(" thread2, ------- "+thread2.getState());
            Thread1.sleep(1);
            System.out.println(" &&&&&&, thread1  "+thread1.getState());
            System.out.println(" &&&&&&, thread2 "+thread2.getState());
            System.out.println(new Date());
            System.out.println(" >>>>>>, thread1 "+thread1.getState());
            System.out.println(" >>>>>>, thread2 "+thread2.getState());
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println(new Date());
        System.out.println(" end of main, thread1, main, 13 "+thread1.getState());
        System.out.println(" end of main, thread2, main, 14 "+thread2.getState());
    }
}
