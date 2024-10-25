package org.example.multi_threading.life_cycle;

public class MainClass3
{
    public static void main(String[] args)
    {
        Thread1 thread10 = new Thread1();
        thread10.setName(" thread 10 ");
        Thread1 thread11 = new Thread1();
        thread11.setName(" thread 11 ");
        Thread1 thread12 = new Thread1();
        thread12.setName(" thread 12 ");

        thread10.setPriority(1);
        thread11.setPriority(5);
        thread12.setPriority(8);

        thread10.start();
        thread11.start();
        thread12.start();

    }
}
