package main.finale.Java.multi_threading.aryan;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ShutdownExample {

    public static void main(String[] args) throws InterruptedException {
        // Example 1: Using shutdown()
        System.out.println("EXAMPLE 1: shutdown()");
        ExecutorService executor1 = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executor1.submit(() -> {
                try {
                    System.out.println("Task " + taskId + " started");
                    // Simulate work
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Task " + taskId + " completed");
                    return "Result of Task " + taskId;
                } catch (InterruptedException e) {
                    System.out.println("Task " + taskId + " was interrupted!");
                    return null;
                }
            });
        }

        // Allow some tasks to start
        TimeUnit.SECONDS.sleep(1);

        // Initiate graceful shutdown
        System.out.println("nCalling shutdown()...");
        executor1.shutdown();

        System.out.println("Is shutdown: " + executor1.isShutdown());
        System.out.println("Is terminated: " + executor1.isTerminated());
        System.out.println("Can submit new tasks? " + !executor1.isShutdown());

        // Wait for tasks to complete
        boolean tasksCompleted = executor1.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println("All tasks completed: " + tasksCompleted);
        System.out.println("Is terminated now: " + executor1.isTerminated());

        // Example 2: Using shutdownNow()
        System.out.println("nnEXAMPLE 2: shutdownNow()");
        ExecutorService executor2 = Executors.newFixedThreadPool(2);

        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executor2.submit(() -> {
                try {
                    System.out.println("Task " + taskId + " started");
                    // Simulate work
                    TimeUnit.SECONDS.sleep(5);
                    System.out.println("Task " + taskId + " completed");
                    return "Result of Task " + taskId;
                } catch (InterruptedException e) {
                    System.out.println("Task " + taskId + " was interrupted!");
                    return null;
                }
            });
        }

        // Allow some tasks to start
        TimeUnit.SECONDS.sleep(1);

        // Immediate shutdown - return list of waiting tasks
        System.out.println("nCalling shutdownNow()...");
        List<Runnable> pendingTasks = executor2.shutdownNow();

        System.out.println("Is shutdown: " + executor2.isShutdown());
        System.out.println("Number of pending tasks that never started: " + pendingTasks.size());

        // Wait for executing tasks to respond to interruption
        executor2.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("Is terminated now: " + executor2.isTerminated());
    }
}
