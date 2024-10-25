package org.example.multi_threading.life_cycle;

public class Thread1 extends Thread
{
    public static int counter = 0;
    @Override
    public void run()
    {
        System.out.println(" inside thread 1 run method ");
        System.out.println(" 111 "+Thread.currentThread().getName());
        int sum = 0;
        for(int i = 0 ; i < 100; i++)
        {
            //System.out.println(" at thread 1, i = "+i);
            sum += i;
            //System.out.println();
            counter++;
        }
        System.out.println(" inside thread 1 stat = "+Thread.currentThread().getState());
        System.out.println(" end of thread 1 ");
    }
}
