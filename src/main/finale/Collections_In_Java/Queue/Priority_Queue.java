package main.finale.Collections_In_Java.Queue;

import java.util.PriorityQueue;
//The PriorityBlockingQueue is an unbounded blocking queue that uses the same ordering rules
// as class PriorityQueue and supplies blocking retrieval operations.
// Since it is unbounded, adding elements may
// sometimes fail due to resource exhaustion resulting in OutOfMemoryError.
// This class does not permit null elements.
public class Priority_Queue {

    public static void main(String[] args) {
        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();

        // Adding items to the pQueue using add()
        pQueue.add(10);
        pQueue.add(20);
        pQueue.add(15);
        pQueue.add(85);
        pQueue.add(6);

        // Printing the top element of PriorityQueue
        System.out.println(pQueue.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pQueue.poll());

        // Printing the top element again
        System.out.println(pQueue.peek());
    }
}
