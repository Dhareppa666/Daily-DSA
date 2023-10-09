package main.finale.asmita_test_multithreading.testing_now;

public class client {

    public static void main(String[] args) {
        printer printer = new printer();

        MyThread t1 = new MyThread("Dhoni", printer);
        MyThread t2 = new MyThread("Yuvraj", printer);

        t1.start();
        t2.start();

    }
}
