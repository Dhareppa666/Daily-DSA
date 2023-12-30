package main.finale.Java.Collections_In_Java.Queue;
// ArrayBlockingQueue class is a bounded blocking queue backed by an array.
// By bounded, it means that the size of the Queue is fixed. Once created,
// the capacity cannot be changed. Attempts to put an element into a full queue
// will result in the operation blocking. Similarly attempts to take an element
// from an empty queue will also be blocked.
// Boundness of the ArrayBlockingQueue can be achieved initially bypassing
// capacity as the parameter in the constructor of ArrayBlockingQueue.
// This queue orders elements FIFO (first-in-first-out).
// It means that the head of this queue is the oldest element of the elements
// present in this queue.

import java.util.concurrent.ArrayBlockingQueue;

// ArrayBlockingQueue is generally used in a thread-safe environment
// where you want to block two or more operating on a single resource,
// allowing only one thread.
// Also, we can block a thread using the capacity bounding factor.

public class Array_Blocking_Queue {
    public static void main(String[] args) {
        // define capacity of ArrayBlockingQueue
        int capacity = 15;

        // create object of ArrayBlockingQueue
        ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<Integer>(capacity);

        // add numbers
        abq.add(1);
        abq.add(2);
        abq.add(3);

        // print queue
        System.out.println("ArrayBlockingQueue:" + abq);

        // remove 223
        boolean response = abq.remove(2);

        // print Queue
        System.out.println("Removal of 2 :" + response);

        // print Queue
        System.out.println("queue contains " + abq);

        // remove all the elements
        abq.clear();

        // print queue
        System.out.println("ArrayBlockingQueue:" + abq);
    }

}

