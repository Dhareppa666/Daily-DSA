package main.intvs.int2023_24.agoda;

import java.util.*;

public class Round_01 {

    // 1. Introduction.
    // 2. Asked few questions about my prev company. tech stack and projects
    // 3. Do you know design patterns?? -> Quickly explained Creational and Structural.
    // 4. Hacker Rank Coding Question 01// 15 mins left
    // 5. Hacker Rank Coding Question 02
        // 2nd question
        // Number plate
        // str="wmf-3j-9k-rt", k=4
        // op="W-MF3J-9KRT"
    // replace
    // str.substr
    // list.add(1,20);
    // list.set(1,20);
    // 6. Why do you want to join AGODA -> Scalability & Customer Obsession

    public static void main(String[] args) {
        List<Integer> input = List.of(1,3,7,3);//1,2,3,2
        List<Integer> list = assignPriorities2(input);
        System.out.println(list);
    }

    public static List<Integer> assignPriorities1(List<Integer> list) {
        // Create a copy of the list and sort it in descending order
        List<Integer> sortedList = new ArrayList<>(list);
//        sortedList.sort(Collections.reverseOrder());

        // Create a map to store the priority of each element
        Map<Integer, Integer> priorityMap = new HashMap<>();
        int priority = 1;

        for (int num : sortedList) { // 1,3,3,7
            // Only assign the next priority if the number hasn't been assigned yet
            priorityMap.putIfAbsent(num, priority++);
        }

        // Create the list of priorities based on the original list
        List<Integer> result = new ArrayList<>();
        for (int num : list) {
            result.add(priorityMap.get(num));
        }

        return result;
    }

    public static List<Integer> assignPriorities2(List<Integer> list) {
        // Create a TreeMap to store elements and their priorities
        Map<Integer, Integer> priorityMap = new TreeMap<>();

        // Assign priorities in a single pass
        int priority = 1;
        for (int num : list) {
            if (!priorityMap.containsKey(num)) {
                priorityMap.put(num, priority++);
            }
        }

        // Create the list of priorities based on the original list
        List<Integer> result = new ArrayList<>();
        for (int num : list) {
            result.add(priorityMap.get(num));
        }

        return result;
    }
}
