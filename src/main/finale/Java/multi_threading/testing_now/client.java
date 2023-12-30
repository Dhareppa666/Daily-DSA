package main.finale.Java.multi_threading.testing_now;

import main.finale.aa.Java.multi_threading.testing_now.MyThread;
import main.finale.aa.Java.multi_threading.testing_now.printer;

public class client {

    public static void main(String[] args) {
        printer printer = new printer();

        MyThread t1 = new MyThread("Dhoni", printer);
        MyThread t2 = new MyThread("Yuvraj", printer);

        t1.start();
        t2.start();

    }
}
