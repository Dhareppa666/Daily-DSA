package org.DSA_Through_C;

public class Doubly_Linked_List {

    static class Node {
        int data;
        Node prev;
        Node next;

        // Constructor to create a new node
        // next and prev is by default initialized as null
        Node(int d) {
            data = d;
        }
    }

    static Node head = null;
    static Node tail = null;

    public static void main(String[] args) {
        Doubly_Linked_List doublyLinkedList = new Doubly_Linked_List();

        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        printDLinkedList(doublyLinkedList);
    }

    private static void printDLinkedList(Doubly_Linked_List doublyLinkedList) {
        Node curr = head;
        if (curr == null) {
            System.out.println("The List is empty..");
            return;
        }
        System.out.println("Nodes of Doubly Linked Lists are :");
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println();

    }

    public static void insert(int data) {

        Node curr = new Node(data);

        if (head == null) {
            head = tail = curr;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = curr;
            curr.prev = tail;
            tail = curr;
            tail.next = null;
        }
    }
}
