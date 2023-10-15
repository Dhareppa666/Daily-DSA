package main.finale.In_Walmart.nextLeap.HeapAndQueue;

import java.util.PriorityQueue;

public class _23_Merge_k_Sorted_Lists_II {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        return partion(lists, 0, lists.length - 1);
    }

    public static ListNode partion(ListNode[] lists, int start, int end) {
        if (start == end) return lists[start];
        if (start < end) {
            int mid = (start + end) / 2;
            ListNode l1 = partion(lists, start, mid);
            ListNode l2 = partion(lists, mid + 1, end);
            return merge(l1, l2);
        } else
            return null;
    }

    //This function is from Merge Two Sorted Lists.
    public static ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }
}
