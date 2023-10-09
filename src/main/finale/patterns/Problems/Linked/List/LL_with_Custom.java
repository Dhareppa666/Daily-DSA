package main.finale.patterns.Problems.Linked.List;

class Node {
    Integer val;
    Node next;

    public Node(){}

    public Node(int val){
        this.val = val;
        this.next = null;
    }
}

public class LL_with_Custom {

    Node head;
    Node tail;
    int length;

    public static void main(String[] args) {
        LL_with_Custom linkedList = new LL_with_Custom();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.print(linkedList);
    }

    private void print(LL_with_Custom linkedList) {
        while (this.head!=null){
            System.out.println(head.val+",");
            this.head = this.head.next;
        }
    }

    public void add(int val) {
        Node newNode = new Node(val);
        if(head==null){
            this.head = newNode;
            this.tail = head;
            this.length = 1;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length = this.length+1;
    }
}
