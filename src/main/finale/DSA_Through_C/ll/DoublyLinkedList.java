package main.finale.DSA_Through_C.ll;

public class DoublyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length; // holds the count

    static class ListNode {
        int data;
        ListNode next;
        ListNode prev;

        ListNode(int data) {
            this.data = data;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return head == null; // Or length ==0
    }

    public int getLength() {
        return length;
    }

    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.addAtEnd(10);
        doublyLinkedList.addAtEnd(20);
        doublyLinkedList.addAtEnd(30);

        doublyLinkedList.print();

        doublyLinkedList.addAtStart(70);
        doublyLinkedList.addAtStart(80);
        doublyLinkedList.addAtStart(90);

        doublyLinkedList.print();


        doublyLinkedList.addAfterGivenData1(doublyLinkedList.head, 20, 22);//by recursion call
        //doublyLinkedList.print();

        doublyLinkedList.addAfterGivenData1(doublyLinkedList.head, 30, 32);
        //doublyLinkedList.print();

        doublyLinkedList.addAfterGivenData1(doublyLinkedList.head, 70, 72);
        //doublyLinkedList.print();

//        doublyLinkedList.addAfterGivenData2(20, 22); // by iterative method
//        doublyLinkedList.addAfterGivenData2(30, 32);
//        doublyLinkedList.addAfterGivenData2(70, 72);

        System.out.println("DELETE--------------");
        doublyLinkedList.deleteNodeAtEnd(doublyLinkedList.head);
        doublyLinkedList.print();

        doublyLinkedList.deleteNodeAtFront(doublyLinkedList.head);
        doublyLinkedList.print();

        doublyLinkedList.deleteNodeAtGivenData(doublyLinkedList.head, 20);
        doublyLinkedList.print();

        doublyLinkedList.print();
        //doublyLinkedList.print();

        //doublyLinkedList.print();

    }

    private void deleteNodeAtGivenData(ListNode head, int data) {
        ListNode curr = head;
        if(curr == null || curr.next == null){
            head = null;
            return;
        }
        while (curr.data != data){
            curr = curr.next;
        }

        curr.prev.next = curr.next;
        curr.next.prev = curr.prev.next;

    }

    private void deleteNodeAtFront(ListNode node) {
        ListNode curr = node;
        if(curr == null || curr.next ==null){
            head = null;
            return;
        }
        head = head.next;
        head.prev = null;
    }

    private void deleteNodeAtEnd(ListNode node) {
        ListNode curr = head;
        while (curr.next !=null) {
            curr = curr.next;
        }
        curr.prev.next = null;
    }

    private void addAfterGivenData1(ListNode curr, int data, int newValue) {

        if (curr.data == data) {
            ListNode n = new ListNode(newValue);
            if (curr.next != null) {
                curr.next.prev = n;
                n.next = curr.next;
            }
            curr.prev = n;
            n.prev = curr;
        } else {
            addAfterGivenData1(curr.next, data, newValue);
        }
    }

    private void addAfterGivenData2(int data, int newValue) {
        /*ListNode n = new ListNode(newValue);

        ListNode curr = head;
        while (curr.data != data) {
            curr = curr.next;
        }
        curr.next.prev = n;
        n.next = curr.next;
        curr.next = n;
        n.prev = curr;*/
    }

    private void addAtStart(int data) {
        ListNode n = new ListNode(data);
        if (head == null) {
            head = n;
        } else {
            n.next = head;
            head.prev = n;
            head = n;
        }

    }

    private void print() {
        ListNode node = head;
        System.out.println("DLL is : \n");
        while (node.next != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.println();
    }

    private void addAtEnd(int data) {
        ListNode n = new ListNode(data);

        if (head == null) {
            head = n;
        } else {
            ListNode curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = n;
            n.prev = curr;
        }
    }
}
