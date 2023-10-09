package main.finale.MultiThreading;

public class MultiThread_Demo_By_Impl {

    public static void main(String[] args) {
        int n = 8;
        for (int i = 1; i <= n; i++) {
            Thread thread = new Thread(new multiThreadDemo());
            //multiThreadDemo thread = new multiThreadDemo();
            thread.start();
        }
    }
}

class multiThreadDemo implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is Running.");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
