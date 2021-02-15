package org.MultiThreading;

public class MT_testing {

    public static void main(String[] args) {
        Thread thread = new Thread(new demo());
        thread.start();
        Thread thread2 = new Thread(new demo2());
        thread2.start();
    }
}

class demo implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " Running.");
            System.out.println("Printing...");
            System.out.println("Printing...");
            System.out.println("Printing...");
            int i=0;
            while (i<=10){
                Thread.sleep(2000);
                System.out.println("Hello Bro ");
                i++;
            }
        } catch (Exception e) {
            System.out.println("Exception Caught.");
        }
    }
}

class demo2 implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " Running.");
            System.out.println("Printing2...");
        } catch (Exception e) {
            System.out.println("Exception Caught.");
        }
    }
}
