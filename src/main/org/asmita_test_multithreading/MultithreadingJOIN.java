package org.asmita_test_multithreading;

public class MultithreadingJOIN {

    public static void main(String[] args) {

        ObjectX objectX = new ObjectX();

        MyThread t1 = new MyThread(objectX, "Dhoni");
        MyThread t2 = new MyThread(objectX, "Yuvraj");

        t1.start();
        t2.start();

    }
}