package main.finale.Java.Collections_In_Java.Set;

import java.util.TreeSet;

public class Tree_Set {

    public static void main(String[] args) {
        TreeSet<StringBuffer> ts = new TreeSet<StringBuffer>();

        // Elements are added using add() method
        ts.add(new StringBuffer("A"));
        ts.add(new StringBuffer("Z"));
        ts.add(new StringBuffer("L"));
        ts.add(new StringBuffer("B"));
        ts.add(new StringBuffer("O"));

        // We will get RunTimeException :ClassCastException
        // As StringBuffer does not
        // implements Comparable interface
        System.out.println(ts);
    }
}
