package main.finale.extras;

import java.util.concurrent.*;

public class FutureExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(1);

        // Submit a task and obtain a Future
        Future<Integer> future = executor.submit(() -> {
            Thread.sleep(5000); // Simulate a time-consuming task
            System.out.println(Thread.currentThread().getName());
            return 42; // Return a result
        });

        System.out.println(Thread.currentThread().getName());
        System.out.println("Test");

        // Do other work while the task is running asynchronously

        // Retrieve the result of the task (blocks until the result is available)
        Integer result = future.get();

        System.out.println("Result: " + result); // Output: Result: 42

        System.out.println("======");

        executor.shutdown(); // Shutdown the ExecutorService
    }
}
