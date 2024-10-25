package org.example.multi_threading.examples;

public class BlockedStateExample {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        //Thread with implements Runnable object
        Task task1 = new Task(sharedResource);
        Task task2 = new Task(sharedResource);

        //Thread object
        Thread thread1 = new Thread(task1, "Thread-1");
        Thread thread2 = new Thread(task2, "Thread-2");
        try {
            thread1.start();
            Thread.sleep(1000);
            System.out.println("thread 1 state = "+thread1.getState());
            thread2.start();
            //
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("thread 1 state = "+thread1.getState());
        System.out.println("thread 2 state = "+thread2.getState());
    }
}

class SharedResource
{
    public synchronized void accessResource()
    {
        System.out.println(Thread.currentThread().getName() + " has acquired the lock and is executing.");
        try
        {
            // sleep for 5 seconds
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " has released the lock.");
    }
}

class Task implements Runnable {
    private final SharedResource sharedResource;

    public Task(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        sharedResource.accessResource();
    }
}
