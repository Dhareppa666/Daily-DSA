package main.finale.In_Walmart.LC.Study_Plan;

//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
//19. Remove Nth Node From End of List
public class Remove_nth_node_from_end_LL {

    public static void main(String[] args) {
        // head = [1,2,3,4,5], n = 2
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0);
        start.next = head;
        ListNode slow = start, fast = start;
        fast = fast.next;
        for (int i = 1; i <= n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }
}
