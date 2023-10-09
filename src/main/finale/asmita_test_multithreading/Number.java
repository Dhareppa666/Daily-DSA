package main.finale.asmita_test_multithreading;

class MyNumber implements Runnable {
    public synchronized void run() {
        try {
            for (int i = 1; i <= 6; i++) {
                Thread.sleep(50);
                System.out.println(Thread.currentThread().getName()+ " : "+i);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception..." + e);
        }
    }
}

public class Number {
    public static void main(String[] args) {
        MyNumber m1 = new MyNumber();
        Thread thread1 = new Thread(m1, "Thread-1");
        Thread thread2 = new Thread(m1, "Thread-2");
        thread1.start();
        thread2.start();
    }
}