package main.finale.DSA.stack_and_queues;

public class Queue {

    Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        enQueue(10);
    }

    private static void enQueue(int data) {

    }
}
