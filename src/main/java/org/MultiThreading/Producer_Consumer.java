package org.MultiThreading;

import java.util.LinkedList;

// Java program to implement solution of producer consumer problem.
public class Producer_Consumer {

    public static void main(String[] args) throws InterruptedException {
        // Object of a class that has both produce() and consume() methods
        final PC pc = new PC();

        // Create producer thread
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Create consumer thread
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        t1.start();
        t2.start();

        // t1 finishes before t2
        t1.join();
        t2.join();
    }

    // This class has a list, producer (adds items to list and consumer (removes items).
    public static class PC {

        // Create a list shared by producer and consumer Size of list is 2.
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 3;

        // Function called by producer thread
        public void produce() throws InterruptedException {
            int value = 0;
            while (true) {
                synchronized (this) {
                    // producer thread waits while list is full
                    while (list.size() == capacity)
                        wait();

                    System.out.println("Producer produced-" + value);
                    list.add(value++);// to insert the jobs in the list
                    notify();// notifies the consumer thread that now it can start consuming

                    Thread.sleep(1000);// makes the working of program easier to understand
                }
            }
        }

        // Function called by consumer thread
        public void consume() throws InterruptedException {
            while (true) {
                synchronized (this) {
                    while (list.size() == 0)// consumer thread waits while list is empty
                        wait();

                    int val = list.removeFirst();// to retrieve the first job in the list
                    System.out.println("Consumer consumed-" + val);
                    notify();// Wake up producer thread
                    Thread.sleep(1000);
                }
            }
        }
    }
}
