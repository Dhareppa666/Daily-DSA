package main.finale.In_Walmart.nextLeap.linkedlist;

//https://leetcode.com/problems/reverse-linked-list-ii/solutions/2311084/java-c-tried-to-explain-every-step/?envType=daily-question&envId=2023-09-07
public class _92_Reverse_Linked_List_II {

    //DEBUG Karo iskoooo

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        for(int i=0; i<left-1; i++) {
            prev = prev.next;
        }

        ListNode curr = prev.next;
        for(int i=0; i<right-left; i++) {
            ListNode forw = curr.next;
            curr.next = forw.next;
            forw.next = prev.next;
            prev.next = forw;
        }
        return dummy.next;
    }
}
