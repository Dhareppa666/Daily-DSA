package org.test;

import java.util.Arrays;
import java.util.List;

public class testtt {

    public static void main(String[] args) {

        // immutable list, cant modify, java.util.Arrays$ArrayList
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // immutable list, cant modify , java 9
        List<Integer> list2 = List.of(1, 2, 3, 4, 5);

        //list.add(6); // UnsupportedOperationException
        list2.add(6);   // UnsupportedOperationException

    }
}
