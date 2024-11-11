package org.example.multi_threading;

public class SyncLambda {

    public static volatile int  counter = 0;

    public static volatile boolean isRunning = true;
    public static void main(String[] args)
    {
        String name = "vakul";
        // not possible??????????????????/
        Thread t1 = new Thread(
                ()-> {
                    /*synchronized (name)
                    {
                        System.out.println("counter "+counter);
                    }*/
                    try
                    {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    for(int i =0 ; i<1000; i++)
                    {
                        counter++;
                    }

                    System.out.println(Thread.currentThread().getName() + counter);
                }

        );

        t1.setName("t1 thread");

        Thread t2 = new Thread(t1);
        t2.setName("t2 thread");

        Thread t3 = new Thread(t1);
        t3.setName("t3 thread");

        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        t3.start();
        try {
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("counter = "+counter);


    }
}
