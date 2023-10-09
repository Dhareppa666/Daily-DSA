package org.JAVA.lambda;

import java.util.*;
import java.util.stream.Collectors;

public class test {

    public static void main(String[] args) {
        //Unsorted list
        List<String> names = Arrays.asList("Alex", "Charles", "Brian", "David");

        List<Integer> numbers = Arrays.asList(22,11,55,44,33);

        usingSortOnList(names);

        usingStreamsSorted(names);


    }

    private static void usingStreamsSorted(List<String> names) {
        //1. Natural order
        List<String> sortedNames = names
                .stream()
                .sorted(Comparator.comparing(String::toString))
                .collect(Collectors.toList());

        System.out.println(sortedNames);

        //2. Reverse order
        List<String> reverseSortedNames = names
                .stream()
                .sorted(Comparator.comparing(String::toString).reversed())
                .collect(Collectors.toList());

        System.out.println(reverseSortedNames);
    }

    private static void usingSortOnList(List<String> names) {
        //1. Natural order
        names.sort(Comparator.comparing(String::toString));
        System.out.println(names);

        //2. Reverse order
        names.sort(Comparator.comparing(String::toString).reversed());
        System.out.println(names);
    }
}
