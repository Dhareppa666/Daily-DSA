package main.finale.In_Walmart.nextLeap.linkedlist;

public class _138_Copy_List_with_Random_Pointer {

    public Node copyRandomList(Node head) {
        Node itr = head, next;

        // First round: make copy of each node,
        // and link them together side-by-side in a single list.
        while (itr != null) {
            next = itr.next;

            Node copy = new Node(itr.val);
            itr.next = copy;
            copy.next = next;

            itr = next;
        }

        // Second round: assign random pointers for the copy nodes.
        itr = head;
        while (itr != null) {
            if (itr.random != null) {
                itr.next.random = itr.random.next;
            }
            itr = itr.next.next;
        }

        // Third round: restore the original list, and extract the copy list.
        itr = head;
        Node dummyHead = new Node(0);
        Node copy, copyItr = dummyHead;

        while (itr != null) {
            next = itr.next.next;

            copy = itr.next;
            copyItr.next = copy;
            copyItr = copy;

            itr.next = next;

            itr = next;
        }
        return dummyHead.next;
    }
}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}