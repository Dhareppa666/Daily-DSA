package org.asmita_test_multithreading;

class MyNumber2 implements Runnable {
    int x;
    MyNumber2(int data){
        this.x = data;
    }
    public synchronized void run() {
        print(x);
    }

    private void print(int x) {

    }


}

public class Number2 {
    public static void main(String[] args) {
        MyNumber2 m1 = new MyNumber2(1);
        Thread thread1 = new Thread(m1, "Thread-1");
        Thread thread2 = new Thread(m1, "Thread-2");
        thread1.start();
        thread2.start();
    }
}