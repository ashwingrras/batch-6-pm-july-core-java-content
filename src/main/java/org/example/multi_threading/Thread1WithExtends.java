package org.example.multi_threading;

public class Thread1WithExtends extends Thread
{
    @Override
    public void run()
    {
        System.out.println(" inside run method, extends Thread");
        for(int i =0 ; i < 10; i++ )
        {
            System.out.println(i);
        }
        System.out.println(" end of run method ");
        //super.run();
        sum();
    }

    public void sum()
    {
        System.out.println(" inside sum ");
    }

}
