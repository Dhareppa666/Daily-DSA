package main.finale.Tech.Dose.Arrays;

import main.finale.DSA_Through_C.ll.LinkedListtt;

public class LinkedIsCycle {

    static ListNode head;

    static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        LinkedIsCycle ll = new LinkedIsCycle();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        ll.insert(40);
        ll.insert(50);

        head.next.next.next.next.next = head.next.next;
        System.out.println("The Linked List Has Cycle: " + isLinkedListHasCycle());
        System.out.println("The Linked List Has Cycle AT: " + findStartNodeOfTheLoop());
    }

    public static ListNode findStartNodeOfTheLoop() {
        ListNode fast = head;
        ListNode slow = head;
        boolean loopExists = false;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                loopExists = true;
                break;
            }
        }
        if (loopExists) {
            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }

        } else {
            System.out.println("Loop does not exists");
            slow = null;
        }
        System.out.println(slow.data);
        return slow;
    }

    //Floyd’s Cycle Detection Algorithm //TC->O(n) and no extra space
    private static boolean isLinkedListHasCycle() {
        if (head == null) {
            return false;
        } else {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
                if (fast == slow) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectLoop() {
        if (head == null)
            return false;
        else {
            while (head != null) {
                if (head.data == -1) {
                    return true;
                } else {
                    head.data = -1;
                    head = head.next;
                }
            }
            return false;
        }
    }

    private void insert(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            ListNode currNode = head;
            while (currNode.next != null) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
    }
}
