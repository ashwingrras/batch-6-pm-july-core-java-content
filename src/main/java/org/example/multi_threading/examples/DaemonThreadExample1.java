package org.example.multi_threading.examples;

import java.util.Date;

public class DaemonThreadExample1
{
    public static void main(String[] args)
    {
        Thread thread1 = new Thread(() -> {
            try
            {
                for(int i =0; i < 1; i++)
                {
                    System.out.println("i *****  = "+i);
                }
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
            System.out.println(" thread1 has set flag to true");
        });
        Thread thread2 = new Thread(() -> {
            try
            {
                Thread.sleep(1000);
                System.out.println("after sleep thread 2");
                for(int j =0; j < 100; j++)
                {
                    System.out.println("j &&&&&&  = "+j);
                }
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
            System.out.println(" thread2 has set flag to true");
        });
        thread2.setDaemon(true);
        System.out.println(new Date());
        thread1.start();
        thread2.start();
        try
        {
            // if we add join then it will not stop thread2, convert to high priority thread
            //thread2.join();
            System.out.println(new Date());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
