package main.finale.Java.multi_threading;

public class MultiThread_Demo_By_Extd {

    public static void main(String[] args) {
        int n = 8;
        for (int i = 1; i <= n; i++) {
            multiThread_Demo runnable = new multiThread_Demo();
            Thread thread = new Thread(runnable);
            //thread.setDaemon(true);
            thread.start();
        }
    }
}

class multiThread_Demo extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " started.");
        } catch (Exception e) {
            System.out.println("Exception Caught.");
        }
    }
}
