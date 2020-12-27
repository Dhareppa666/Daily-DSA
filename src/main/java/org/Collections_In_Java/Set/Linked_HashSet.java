package org.Collections_In_Java.Set;

import java.util.LinkedHashSet;

// The LinkedHashSet is an ordered version of HashSet that maintains a doubly-linked List across all elements.
// When the iteration order is needed to be maintained this class is used.
// LinkedHashSet(int size)
// LinkedHashSet(int capacity, float fillRatio)
public class Linked_HashSet {

    public static void main(String[] args) {
        LinkedHashSet<String> linkedset = new LinkedHashSet<String>();

        linkedset.add("A");
        linkedset.add("B");
        linkedset.add("C");
        linkedset.add("D");

        // This will not add new element as A already exists
        linkedset.add("A");
        linkedset.add("E");

        System.out.println("Size of LinkedHashSet = " +
                linkedset.size());
        System.out.println("Original LinkedHashSet:" + linkedset);
        System.out.println("Removing D from LinkedHashSet: " +
                linkedset.remove("D"));
        System.out.println("Trying to Remove Z which is not "+
                "present: " + linkedset.remove("Z"));
        System.out.println("Checking if A is present=" +
                linkedset.contains("A"));
        System.out.println("Updated LinkedHashSet: " + linkedset);
    }
}
