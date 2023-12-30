package main.finale.DSA.linked_list;


public class isPalindrome {

    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(2);
        l.next.next.next = new ListNode(1);
        System.out.println(isPalindrome(l));
    }

    public static boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow=head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode currNode= head;
        while(slow!=null){
            if(slow.val !=currNode.val){
                return false;
            }
            currNode = currNode.next;
            slow = slow.next;
        }
        return true;
    }
}
