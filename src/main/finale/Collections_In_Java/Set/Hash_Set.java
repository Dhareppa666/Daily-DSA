package main.finale.Collections_In_Java.Set;
import java.util.HashSet;
import java.util.Iterator;

//The underlying data structure for HashSet is Hashtable.
// Load Factor:  When the number of entries in the hash table exceeds the product of the load factor and the current capacity.
//Example: If internal capacity is 16 and the load factor is 0.75 then the number of buckets will automatically
// get increased when the table has 12 elements in it.
// HashSet(int initialCapacity)
// HashSet(int initialCapacity, float loadFactor) -->0.82
public class Hash_Set {

    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();

        // Adding elements into HashSet usind add()
        h.add("India");
        h.add("Australia");
        h.add("South Africa");
        h.add("India"); // adding duplicate elements
        // it will just ignore the duplicates. just keep only one copy.

        // Displaying the HashSet
        System.out.println(h);
        System.out.println("List contains India or not:"
                + h.contains("India"));

        // Removing items from HashSet using remove()
        h.remove("Australia");
        System.out.println("List after removing Australia:"
                + h);

        // Iterating over hash set items
        System.out.println("Iterating over list:");
        Iterator<String> i = h.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
