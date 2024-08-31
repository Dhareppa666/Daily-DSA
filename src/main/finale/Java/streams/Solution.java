package main.finale.Java.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        // streams don't change the original data.
        // present in java.util.streams;

        //1. stream().map()... pretty basic
        //2. stream().forEach()... basic
        //3. Matching

        List<String> list = List.of("Harman", "Microsoft", "Walmart", "Himalaya");

        boolean isValid = list.stream().anyMatch((s) -> s.startsWith("H"));
        boolean isAllMatching = list.stream().allMatch((s) -> s.startsWith("H"));// If stream is empty then "true"
        boolean isNoneMatching = list.stream().noneMatch((s) -> s.startsWith("H"));

        System.out.println("isValid: " + isValid);
        System.out.println("isAllMatching: " + isAllMatching);
        System.out.println("isNoneMatching: " + isNoneMatching);

        System.out.println("------------------------");

        //4. Reduction -> Reducer
        List<Integer> numbers = List.of(1, 2, 3);
        Integer sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("Sum of elements are: " + sum);

        System.out.println("------------------------");

        //5. Collection -> collect
        List<String> upperCaseNames = list.stream().map((s) -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println("Uppercase Names are: " + upperCaseNames);

        String[] namesArr = {"apple", "banana", "apple", "orange", "banana", "apple"};
        Map<String, Long> freqMap = Arrays.stream(namesArr)
                .collect(Collectors.groupingBy(str -> str, Collectors.counting()));
        System.out.println("Element and its occurrences are: " + freqMap);

        System.out.println("------------------------");

        //6. Terminal Operations -> count, sorted, min, max, toArray(), of(), limit, skip, distinct, findFirst, findAny
        Object[] toArray = list.stream().toArray();

        Stream<Object> streamOfMethod = Stream.of("A", "B", "A");
        streamOfMethod.forEach(System.out::print);

        System.out.println("------------------------");

        //7. Parallel Stream
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        Integer numsSum = nums.stream().parallel().reduce(0, Integer::sum) + 10;
        System.out.println("Parallel Stream sum result: " + numsSum);
    }
}
