package main.finale.Java.Collections_In_Java.Queue;

import java.util.concurrent.LinkedBlockingQueue;

public class Linked_Blocking_Queue {
    
    public static void main(String[] args) {
        // define capacity of LinkedBlockingQueue
        int capacityOfQueue = 7;

        // create object of LinkedBlockingQueue
        LinkedBlockingQueue<String> linkedQueue
                = new LinkedBlockingQueue<String>(capacityOfQueue);

        // Add element to LinkedBlockingQueue
        linkedQueue.add("John");
        linkedQueue.add("Tom");
        linkedQueue.add("Clark");
        linkedQueue.add("Kat");

        // find head of linkedQueue using peek() method
        String head = linkedQueue.peek();

        // print result
        System.out.println("Queue is " + linkedQueue);

        // print head of queue
        System.out.println("Head of Queue is " + head);

        // removing one element
        linkedQueue.remove();

        // again get head of queue
        head = linkedQueue.peek();

        // print result
        System.out.println("\nRemoving one element from Queue\n");
        System.out.println("Queue is " + linkedQueue);

        // print head of queue
        System.out.println("Head of Queue is " + head);
    }
}
