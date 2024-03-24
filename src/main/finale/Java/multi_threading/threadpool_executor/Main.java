package main.finale.Java.multi_threading.threadpool_executor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 4, 10,
                TimeUnit.MINUTES, new ArrayBlockingQueue<>(2), new ThreadFactory(), new RejectionHandler());

        for (int i=1; i<=7; i++) {
            threadPoolExecutor.execute(()->{
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Task is processed by " + Thread.currentThread().getName());
            });
        }
    }
}
