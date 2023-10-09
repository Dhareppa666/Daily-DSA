package main.finale.Collections_In_Java.Set;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

//Since SortedSet is an interface, objects cannot be created of the type SortedSet.
// We always need a class which extends this list in order to create an object.
public class Sorted_Set {

    public static void main(String[] args) {
        SortedSet<String> ts = new TreeSet<String>();

        // Adding elements into the TreeSet
        // using add()
        ts.add("India");
        ts.add("Australia");
        ts.add("abc");
        ts.add("South Africa");
        ts.add("A");
        ts.add("AB");
        ts.add("1");
        ts.add("9");
        ts.add("0");
        ts.add("0");
        //ts.add(null);

        // Adding the duplicate
        // element
        ts.add("India");

        // Displaying the TreeSet
        System.out.println(ts);

        // Removing items from TreeSet
        // using remove()
        ts.remove("Australia");
        System.out.println("Set after removing "
                + "Australia:" + ts);

        // Iterating over Tree set items
        System.out.println("Iterating over set:");
        Iterator<String> i = ts.iterator();
        while (i.hasNext())
            System.out.println(i.next());
    }
}
