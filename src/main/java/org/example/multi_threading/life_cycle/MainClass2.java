package org.example.multi_threading.life_cycle;

public class MainClass2
{
    public static void main(String[] args)
    {
        Thread1 thread1 = new Thread1();
        System.out.println(thread1.getState()); // NEW
        thread1.start();
        System.out.println(thread1.getState()); // RUNNABLE
        try
        {
            System.out.println(Thread1.counter);
            Thread.sleep(500);
            System.out.println(Thread1.counter);
            System.out.println(thread1.getState()); // TIMED_WAITING
            thread1.join();
            System.out.println(Thread1.counter);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread1.getState()); // TERMINATED
    }
}
