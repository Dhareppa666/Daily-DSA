package org.DSA_Through_C.ll;

// Java program to implement
// a Singly Linked List.
public class LinkedList {

    Node head; //head Of List

    // Linked list Node.
    // This inner class is made static, so that main() can access it
    static class Node {
        int data;
        Node next;

        //Constructor is to create new node,
        //Next is by Default initialized as Null.
        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList = insert(linkedList, 10);
        linkedList = insert(linkedList, 20);
        linkedList = insert(linkedList, 30);
        linkedList = insert(linkedList, 40);
        linkedList = insert(linkedList, 50);
        linkedList = insert(linkedList, 60);
        printLinkedList(linkedList);

        /*System.out.println();
        linkedList = deleteByKey(linkedList, 30);
        printLinkedList(linkedList);*/

        linkedList = insertionAtPosition(linkedList, 4, 80);
        printLinkedList(linkedList);

        linkedList = insertionAtPositionReplace(linkedList, 6, 120);
        printLinkedList(linkedList);

        Node reverseLinkedList = reverseLinkedList(linkedList.head);
        printLinkedList2(reverseLinkedList);
    }

    private static Node reverseLinkedList(Node node) {//   null<-1(current, prev) -- 2->3
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;

            current.next = prev;
            prev = current;

            current = next;
        }
        return prev;
    }

    //10, 20 , 30, 40, 50, 60
    private static LinkedList insertionAtPositionReplace(LinkedList linkedList, int pos, int data) {
        Node isCurrent = linkedList.head;

        int counter = 1;
        while (counter != pos) {
            isCurrent = isCurrent.next;
            counter++;
        }

        isCurrent.data = data;

        return linkedList;
    }

    //10, 20 , 30, 40, 50, 60
    private static LinkedList insertionAtPosition(LinkedList linkedList, int pos, int data) {

        Node newData = new Node(data);

        Node curr = linkedList.head;
        Node prev = null;
        int counter = 1;

        while (counter != pos) {
            prev = curr;
            curr = curr.next;
            counter++;
        }

        prev.next = newData;
        newData.next = curr;

        return linkedList;
    }

    // Method to insert a new node
    private static LinkedList insert(LinkedList linkedList, int data) {
        // Create a new node with given data
        Node new_Node = new Node(data);
        new_Node.next = null;

        //if List is empty
        //then we make new node as HEAD
        if (linkedList.head == null) {
            linkedList.head = new_Node;
        } else {
            //Else traverse through the list till last
            // and insert a new node.
            Node last = linkedList.head;
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_Node;
        }
        return linkedList;
    }


    private static LinkedList deleteByKey(LinkedList linkedList, int key) {
        Node currNode = linkedList.head;

        //1. if data is present @Head position.
        if (currNode != null && currNode.data == key) {
            linkedList.head = currNode.next;
            System.out.println("The Key is found in Linked List and Deleted.");
            return linkedList;
        }
        //2. If Data is present @ any position Other than Head.
        Node prev = null;
        while (currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }

        if (currNode != null) {
            prev.next = currNode.next;
            System.out.println("The Key is found in Linked List and Deleted.");
        }

        //3. Not present anywhere in the linked list.
        if (currNode == null) {
            System.out.println("The Key is NOT found in Linked List..!!!");
        }

        return linkedList;
    }

    private static void printLinkedList(LinkedList linkedList) {
        Node currNode = linkedList.head;
        System.out.print("Linked List : ");

        //Traverse through the LinkedList.
        while (currNode != null) {

            //Print all data in the current Node
            System.out.print(currNode.data + " -> ");

            //Go to the next Node.
            currNode = currNode.next;
        }
        System.out.println();
    }

    private static void printLinkedList2(Node node) {
        Node currNode = node;
        System.out.print("Linked List : ");

        //Traverse through the LinkedList.
        while (currNode != null) {

            //Print all data in the current Node
            System.out.print(currNode.data + " -> ");

            //Go to the next Node.
            currNode = currNode.next;
        }
        System.out.println();
    }
}
