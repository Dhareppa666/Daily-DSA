package org.MultiThreading;

public class MultiThread_Demo_By_Extd {

    public static void main(String[] args) {
        int n = 8;
        for (int i = 1; i <= n; i++) {
            //multiThread_Demo thread = new multiThread_Demo();
            Thread thread = new Thread(new multiThread_Demo());
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
