package com.org.Collections_In_Java.List;

import java.util.Vector;
// About vector is It is synchronized, one one thread is accessible at a time.
//In the case of concurrent modification, it fails and throws the ConcurrentModificationException.
//If the increment is specified, Vector will expand according to it in each allocation cycle -
// but if the increment is not specified then the vector’s capacity gets doubled in each allocation cycle.

public class Vector_Example {

    public static void main(String[] args) {

        // Declaring the Vector_Example with
        // initial size n
        Vector<Integer> v = new Vector<Integer>(5);

        // Appending new elements at
        // the end of the vector
        for (int i = 1; i <= 5; i++)
            v.add(i);

        // Printing elements
        System.out.println(v);

        // Remove element at index 3
        v.remove(3);

        // Displaying the vector
        // after deletion
        System.out.println(v);

        // Printing elements one by one
        for (int i = 0; i < v.size(); i++)
            System.out.print(v.get(i) + " ");
    }
}
