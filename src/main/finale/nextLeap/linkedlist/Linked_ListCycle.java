package main.finale.nextLeap.linkedlist;

public class Linked_ListCycle {

    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast !=null && fast.next !=null) {
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast) {
                return true;
            }
        }
        return false;
    }

}
