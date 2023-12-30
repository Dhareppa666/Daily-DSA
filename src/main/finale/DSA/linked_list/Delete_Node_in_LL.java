package main.finale.DSA.linked_list;

public class Delete_Node_in_LL {

    public static void main(String[] args) {

    }

    public static Node deleteNode(Node head, int target) {
        if (head == null) {
            return null;
        }
        if (head.val == target) {
            return head.next;
        }
        Node current = head;
        Node previous = null;
        while (current != null && current.val != target) {
            previous = current;
            current = current.next;
        }
        if (current == null) {
            return head; // Node not found
        }
        previous.next = current.next;
        return head;
    }

    public static void traverse(Node head) {
        if (head == null) {
            System.out.println("Empty list");
            return;
        }

        Node current = head;
        do {
            System.out.print(current.val + " ");
            current = current.next;
        } while (current != head);
    }

}
