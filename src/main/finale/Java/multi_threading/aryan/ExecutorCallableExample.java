package main.finale.Java.multi_threading.aryan;

import java.util.concurrent.*;

public class ExecutorCallableExample {

    private static final int NUM_CORES = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) throws InterruptedException {
        // Beauty at its BESTTTTTT <3
        Thread t1 = new Thread(()-> System.out.println("DONE"));
        t1.start();
        t1.join();
        System.out.println(NUM_CORES);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
//        ExecutorService executorService2 = new ThreadPoolExecutor();

        try{

            Callable<String> c1 = new MyCallable("t1");
            Callable<String> c2 = new MyCallable("t2");

            Future<String> f1 = executorService.submit(c1);
            Future<String> f2 = executorService.submit(c2);

            System.out.println("Result from c1=> " + "\n" + f1.get());

            System.out.println("Result from c2=> " + "\n" + f2.get());

        } catch (Exception e) {

        } finally {
            executorService.shutdown();
        }
    }
}

class MyCallable implements Callable<String> {

    private String name;

    public MyCallable(String name) {
        this.name = name;
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= 5; i++) {
            sb.append(name).append(":").append(i).append("\n");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return sb.toString();
    }
}
