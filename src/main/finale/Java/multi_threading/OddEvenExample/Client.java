package main.finale.Java.multi_threading.OddEvenExample;

import main.finale.aa.Java.multi_threading.OddEvenExample.Generator;
import main.finale.aa.Java.multi_threading.OddEvenExample.OddEvenEx;

public class Client {

    private static int total_No_Of_Threads = 2;

    private static int total_No_Of_Sequences = 20;

    public static void main(String[] args) {

        OddEvenEx obj = new OddEvenEx(total_No_Of_Threads, total_No_Of_Sequences);

        //create two threads
        Thread t1 = new Thread(new Generator(obj, 1), "Thread-1");
        Thread t2 = new Thread(new Generator(obj, 0), "Thread-2");

        //start your threads
        t1.start();
        t2.start();
    }
}
