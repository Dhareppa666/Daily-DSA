package main.finale.DSA_Through_C.Stacks_Queues;

public class Stacks_Queues_Using_LinkedList {

    static Node head;

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static int top;

    public static void main(String[] args) {
        displayStack();
        push(10);
        push(20);
        push(30);
        push(40);
        push(50);
        displayStack();
        pop();
        displayStack();
    }

    private static void pop() {
        if(head == null){
            System.out.println("The Stack to empty");
            return;
        }
        head = head.next;
    }

    private static void displayStack() {
        if(head == null){
            System.out.println("The Stack is Empty.");
            return;
        }
        Node curr = head;
        System.out.print("The Stack is : ");
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    private static void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
}
