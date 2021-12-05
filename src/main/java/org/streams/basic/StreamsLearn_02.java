package org.streams.basic;

import org.util.AllInOneUtils;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsLearn_02 {

    public static void main(String[] args) {
        //2.Count, sorted, MinMax, ForEach, toArray, of()
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        long count = list.stream().count();
        System.out.println("The size of list is :" + count);

        Long count2 = list.stream().map(x -> x + 10).filter(x -> x > 12).count();
        System.out.println("The size of list is :" + count2);

        System.out.println("--------------------------");
        List<Integer> sorted = list.stream().sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());
        List<Integer> sorted2 = list.stream().sorted((a, b) -> b.compareTo(a)).collect(Collectors.toList());

        System.out.println(sorted);
        System.out.println(sorted2);

        System.out.println("--------------------------");
    }
}
