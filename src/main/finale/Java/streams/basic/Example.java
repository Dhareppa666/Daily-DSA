package main.finale.Java.streams.basic;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        int n=5;
        while(n>0){
            list.add(n);
            n--;
        }
        //configureTheStream(list);
        list.add(25);
        list.add(13);
        processTheStream(list);
    }

    private static void processTheStream(List<Integer> list) {
        //Get the count/size of list.
        long count = list.stream().count();
        System.out.println("The total No of Elements in list: "+count);

        Optional<Integer> max = list.stream().max((a, b)->Integer.compare(a,b));
        System.out.println("The Max Element is: "+max);

    }

    private static void configureTheStream(List<Integer> list) {
        // Using Map.
        List<Integer> collect = list.stream().map(x -> x * x).collect(Collectors.toList());

        //Using filter
        List<Integer> collect3 = list.stream().filter(x -> x != 1).collect(Collectors.toList());

        //Using filter+Predicate
        Predicate<Integer> predicate = x-> x>2 ;
        List<Integer> collect2 = list.stream().filter(predicate).collect(Collectors.toList());

        //I am just printer.
        for(Integer x : collect){
            System.out.print(x+"-");
        }
        System.out.println();
    }
}
