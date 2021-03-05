package org.DSA_Through_C.ll;

public class LinkedListtt {

    ListNode head;

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int d) {
            this.data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        LinkedListtt ll = new LinkedListtt();
        ll = insertData(ll, 10);// by default last
        printData(ll);

        ll = insertData(ll, 20);
        printData(ll);

        ll = insertData(ll, 30);
        printData(ll);

        ll = insertData(ll, 40);
        printData(ll);

        ll = insertData(ll, 50);
        printData(ll);

        ll = insertDataAtFirstPos(ll, 100);
        printData(ll);

        ll = insertDataAtFirstPos(ll, 200);
        printData(ll);

        ll = insertDataAtGivenPos(ll, 4, 123);//needs improvement on this method
        printData(ll);

        ll = deleteDataAtGivenPos(ll, 2);
        printData(ll);

        //ll = reverseLL(ll);
        //printData(ll.head);
    }

    /*private static LinkedListtt reverseLL(ListNode head) {
        ListNode curr = ll.head;
        ListNode prev = null;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev =
            curr = curr.next;
        }


        return ;
    }*/

    private static LinkedListtt deleteDataAtGivenPos(LinkedListtt ll, int pos) {
        int counter = 1;
        ListNode curr = ll.head;
        ListNode prev = null;
        while (counter != pos){
            prev = curr;
            curr = curr.next;
            counter++;
        }
        prev.next = curr.next;
        return ll;
    }

    private static LinkedListtt insertDataAtGivenPos(LinkedListtt ll, int pos, int data) {
        ListNode newData = new ListNode(data);
        int counter = 1;
        ListNode curr = ll.head;
        ListNode prev = null;
        while (pos != counter){
            prev = curr;
            curr = curr.next;
            counter++;
        }
        prev.next = newData;
        newData.next = curr.next;
        return ll;
    }

    private static LinkedListtt insertDataAtFirstPos(LinkedListtt ll, int data) {
        ListNode newData = new ListNode(data);

        newData.next = ll.head;
        ll.head = newData;

        return ll;


    }

    private static void printData(LinkedListtt ll) {
        System.out.print("The LL is :");
        ListNode curr = ll.head;
        while (curr != null) {
            System.out.print(curr.data+" -> ");
            curr = curr.next;
        }
        System.out.println();

    }

    private static LinkedListtt insertData(LinkedListtt ll, int data) {
        ListNode newData = new ListNode(data);
        if (ll.head == null) {
            ll.head = newData;
        } else {
            ListNode last = ll.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newData;
        }
        return ll;
    }
}
