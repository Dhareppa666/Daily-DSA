package main.finale.nextLeap.linkedlist;

//https://www.overleaf.com/articles/abhinav-jaiswals-cv/xsdgnjjsbbpn
public class Binary_to_Decimal {

    public int getDecimalValue2(ListNode head) {
        int num = head.val;
        while (head.next != null) {
            num = num * 2 + head.next.val;
            head = head.next;
        }
        return num;
    }

    public int getDecimalValue(ListNode head) {
        ListNode curr = head;
        int num = 0;
        while(curr!=null) {
            int digit = curr.val;
            num = num * 10 + digit;
            curr = curr.next;
        }
        return getDecimalVal(num);
    }

    public int getDecimalVal(int num) {
        int res = 0;
        int i = 0;
        while(num!=0) {
            int rem = num %10;
            res += rem * Math.pow(2, i);
            num = num/10;
            i++;
        }
        return res;
    }
}
