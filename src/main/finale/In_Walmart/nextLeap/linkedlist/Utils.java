package main.finale.In_Walmart.nextLeap.linkedlist;

public class Utils {

    public static void printLL(ListNode head) {
        //Node current will point to head
        ListNode current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}
