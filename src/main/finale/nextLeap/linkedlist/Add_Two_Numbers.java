package main.finale.nextLeap.linkedlist;

import static main.finale.In_Walmart.nextLeap.linkedlist.Utils.printLL;

public class Add_Two_Numbers {

    public static void main(String[] args) {
        ListNode res = addTwoNumbers(null, null);
        printLL(res);
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode prev = new ListNode(0);
        ListNode temp = prev;
        while(l1!=null || l2 !=null){
            int sum = 0;
            if(l1 !=null ) {
                sum += l1.val ;
                l1 = l1.next;
            }
            if(l2 != null ) {
                sum += l2.val ;
                l2 = l2.next;
            }
            sum += carry;
            carry = sum / 10;
            prev.next = new ListNode(sum % 10);
            prev = prev.next;
        }
        if(carry !=0){
            prev.next = new ListNode(carry);
        }
        return temp.next;
    }
}
