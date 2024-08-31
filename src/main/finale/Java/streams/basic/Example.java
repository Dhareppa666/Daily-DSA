package main.finale.Java.streams.basic;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Example {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        int n = 5;
        while (n >= 0) {
            list.add(n);
            n--;
        }
        list.add(25);
        list.add(13);
        processTheStream(list);
        sorting();
    }

    private static void processTheStream(List<Integer> list) {
        //Get the count/size of list.
        long count = list.stream().count();
        System.out.println("The total No of Elements in list: " + count);

        Optional<Integer> max = list.stream().max((a, b) -> Integer.compare(a, b));
        System.out.println("The Max Element is: " + max);

        Optional<Integer> min = list.stream().min((a, b) -> Integer.compare(a, b));
        System.out.println("The Min Element is: " + min);

        List<Student> list2 = List.of(new Student(1, "Arun"), new Student(2, "Singh"), new Student(3, "Seema"));
        list2.stream().map(Student::getName).forEach(x -> System.out.print(x + ","));

        Map<String, Integer> map = new HashMap<>();
        map.put("Arun", 1);
        map.put("Justin", 2);
        map.put("Jess", 3);
        map.put("JB-Kaka", 4);

        Predicate<Integer> predicate = x -> x > 2;
        List<Integer> collect2 = list.stream().filter(predicate).collect(Collectors.toList());

    }

    private static void sorting() {
        //2.Count, sorted, MinMax, ForEach, toArray, of()
        List<Integer> list = List.of(1, 2, 3, 5, 4, 6, 7);
        long count = list.stream().count();
        System.out.println("The size of list is :" + count);

        Long count2 = list.stream().map(x -> x + 10).filter(x -> x > 12).count();
        System.out.println("The size of list is :" + count2);

        System.out.println("--------------------------");
        List<Integer> sorted = list.stream().sorted((a, b) -> Integer.compare(a, b)).collect(Collectors.toList());
        List<Integer> sorted2 = list.stream().sorted((a, b) -> Integer.compare(b, a)).collect(Collectors.toList());

        System.out.println(sorted);
        System.out.println(sorted2);

        System.out.println("--------------------------");
    }

}
