package org.example.multi_threading.examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample2 {
    public  static int counter = 0;
    public static void main(String[] args)
    {
        // Create a thread pool with 1 threads
        ExecutorService executor = Executors.newFixedThreadPool(2);
        // Submit 10 tasks to the thread pool
        for (int i = 1; i <= 10; i++)
        {
            Runnable task = new WorkerTask(i);
            //executor.submit(task);
            executor.execute(task);
        }
        // Shut down the executor
        executor.shutdown();
        Runnable task11 = new WorkerTask(11);
        executor.submit(task11);
        //executor.execute(task11);
        Runnable task12 = new WorkerTask(12);
        executor.submit(task12);
        //executor.execute(task12);
        System.out.println(counter);
    }
}

class WorkerTask implements Runnable {
    private final int taskId;

    public WorkerTask(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task " + taskId + " is running on thread " + Thread.currentThread().getName());
        try
        {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Task " + taskId + " completed on thread " + Thread.currentThread().getName());
        ThreadPoolExample2.counter++;
    }
}
