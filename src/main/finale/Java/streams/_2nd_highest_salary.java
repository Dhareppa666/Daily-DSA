package main.finale.Java.streams;

import java.util.*;

public class _2nd_highest_salary {

    public static void main(String[] args) {
        List<Integer> salaries = Arrays.asList(1000, 2000, 1500, 3000, 2000, 2500, 3000);

        Optional<Integer> secondHighestSalary = salaries.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        if (secondHighestSalary.isPresent()) {
            System.out.println("Second highest salary: " + secondHighestSalary.get());
        } else {
            System.out.println("There is no second highest salary.");
        }
    }
}
