package main.finale.Collections_In_Java.List;

import java.util.LinkedList;

public class LinkedList_Examples {

    public static void main(String[] args) {
        // Creating object of the
        // class linked list
        LinkedList<String> ll = new LinkedList<>();

        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");
        ll.add("A");

        System.out.println(ll);

        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
    }
}
