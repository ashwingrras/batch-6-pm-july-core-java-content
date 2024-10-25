package org.example.multi_threading;

public class Thread1WithImplements implements Runnable
{
    @Override
    public void run()
    {
        System.out.println(" inside run method, implements Runnable ");
        for(int i =0 ; i < 10; i++ )
        {
            System.out.println(i);
        }
        System.out.println(" end of run method ");
    }

    public void sum()
    {
        System.out.println(" inside start method, implements Runnable ");
    }

}
