package org.MultiThreading.OddEvenExample;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class OddEvenEx {

    private int number = 1;

    private int numberOfThreads;

    private int totalNumberInSequence;

    public OddEvenEx(int numberOfThreads, int totalNumberInSequence) {
        this.numberOfThreads = numberOfThreads;
        this.totalNumberInSequence = totalNumberInSequence;
    }

    public void printNumbers(int result) {
        synchronized (this) {
            while (number <= totalNumberInSequence-1) {
                while (result != (number % 2)) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " -> " + number++);
                notifyAll();
            }
        }
    }
}
