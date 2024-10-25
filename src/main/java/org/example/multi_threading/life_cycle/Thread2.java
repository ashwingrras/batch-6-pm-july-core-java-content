package org.example.multi_threading.life_cycle;

public class Thread2 extends Thread
{
    @Override
    public void run() {

        System.out.println(" inside thread 2 run method ");
        System.out.println(" 2222 "+Thread.currentThread().getName());
        int sum = 0;
        for(int i = 0 ; i < 100; i++)
        {
            //System.out.println(" at thread 2, i = "+i);
            sum += i;
        }
        System.out.println(" inside thread 2 stat = "+Thread.currentThread().getState());
        System.out.println(" end of thread 2 ");
    }
}
