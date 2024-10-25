package org.example.multi_threading.examples;

public class ThreadWithImplements implements Runnable
{

    @Override
    public void run()
    {
        System.out.println(" at 1111111 ThreadWithImplements rum method, start ");
        int number = 1;
        for(int i =1; i <= 10; i++)
        {
            System.out.println("number "+number+" * "+i +" = "+i*number +", at thread "+Thread.currentThread().getName());
            try
            {
                if(i == 10)
                {
                    i = 0;
                    Thread.sleep(1000);
                    //System.out.println("at run method: "+Thread.currentThread().getState());
                    number++;
                }
                if(number > 5)
                {
                    break;
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(" at 11111 ThreadWithImplements rum method, end");
    }
}
