package org.example.multi_threading.examples;

class Threaddemo1 extends Thread{
    private String name1 = "Resource 1";
    private String name2 = "Resource 2";
   public void run()
   {
       System.out.println("at run method thread1 start");
       // synchronized block
       synchronized(name1)
       {
        System.out.println("Thread 1 holding : " +name1);
        try
        {
            Thread.sleep(500);
        } catch (Exception e) {
            // TODO: handle exception
        }
           // synchronized block
            synchronized(name2)
            {
                System.out.println("Thread 1 holding : " +name2);
                //end
            }
        //end
       }
       //
       System.out.println("at run method thread1 end");
   }
}
class Threaddemo2 extends Thread{
    private String name1 = "Resource 1";
    private String name2 = "Resource 2";
   public void run()
   {
       System.out.println("at run method thread2 start");
       // synchronized block
       synchronized(name2)
       { // name1
        System.out.println("Thread 2 holding : " +name2);
        try
        {
            Thread.sleep(500);
        } catch (Exception e) {
            // TODO: handle exception
        }
           // synchronized block
            synchronized(name1)
            { // name2
                System.out.println("Thread 2 holding : " +name1);
            }
       }
       System.out.println("at run method thread2 end");
   }
}
public class DeadlockDemo {
   
    public static void main(String[] args) 
    {
        Threaddemo1 d1  = new Threaddemo1();
        Threaddemo2 d2  = new Threaddemo2();
        d1.start();
        d2.start();
        System.out.println("d1: "+d1.getState());
        System.out.println("d2: "+d2.getState());
        try {
            Thread.sleep(1000);
            System.out.println("d1: "+d1.getState());
            System.out.println("d2: "+d2.getState());
            Thread.sleep(2000);
            System.out.println("d1: "+d1.getState());
            System.out.println("d2: "+d2.getState());
            d1.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("after both thread, main method END");
    }
}
