package org.example.multi_threading.examples;

public class WaitingStateExample
{
    private static final Object lock = new Object();
    public static void main(String[] args)
    {
        WaitingTask waitingTask = new WaitingTask();
        Thread waitingThread = new Thread(waitingTask);
        waitingThread.setName("WaitingThread");
        Thread notifyingThread = new Thread(new NotifyingTask(), "NotifyingThread");

        waitingThread.start();
        try
        {
            Thread.sleep(1000);
            System.out.println("waitingThread thread state: "+waitingThread.getState());
            //waitingThread.join();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        notifyingThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("waitingThread thread state: "+waitingThread.getState());
        System.out.println("notifyingThread thread state: "+notifyingThread.getState());
    }

    static class WaitingTask implements Runnable {
        @Override
        public void run() {

            synchronized (lock)
            {
                try {
                    System.out.println(Thread.currentThread().getName() + " is going to wait.");
                    lock.wait(); // This will put the thread in waiting state
                    //Thread.sleep(10000);
                    System.out.println(Thread.currentThread().getName() + " is resumed.");
                } catch (Exception e) {
                    Thread.currentThread().interrupt();
                    e.printStackTrace();
                }
            }
        }
    }

    static class NotifyingTask implements Runnable {
        @Override
        public void run() {
            // Adding sleep to ensure WaitingTask runs first and enters the waiting state
            try {
                Thread.sleep(1000); // Sleep for a bit to ensure the waiting thread gets to wait()
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            synchronized (lock)
            {
                System.out.println(Thread.currentThread().getName() + " is going to notify.");
                lock.notify(); // This will wake up the waiting thread
                System.out.println(Thread.currentThread().getName() + " has notified.");
                for(int i=0; i < 10; i++)
                {
                    System.out.println(i);
                }
            }
        }
    }
}
