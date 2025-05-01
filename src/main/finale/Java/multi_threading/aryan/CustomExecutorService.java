package main.finale.Java.multi_threading.aryan;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomExecutorService {

    public static void main(String[] args) {
        // ThreadPoolExecutor with 2 core threads, max 4 threads, and queue size of 2
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                2, 4, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<>(2),
                new ThreadPoolExecutor.AbortPolicy() // Reject tasks if queue & max threads are full
        );

        for (int i = 1; i <= 10; i++) {
            final int taskId = i;
            executor.execute(() -> {
                System.out.println(Thread.currentThread().getName() + " is processing task " + taskId);
                try {
                    Thread.sleep(2000); // Simulating task execution
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            });
        }
        executor.shutdown();
    }

}
