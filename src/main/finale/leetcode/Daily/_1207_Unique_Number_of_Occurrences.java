package main.finale.leetcode.Daily;

import java.util.*;

// https://leetcode.com/problems/unique-number-of-occurrences/description/?envType=daily-question&envId=2024-01-17
// Given an array of integers arr, return true if the number of occurrences of
// each value in the array is unique or false otherwise.
public class _1207_Unique_Number_of_Occurrences {

    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        boolean res = uniqueOccurrences(arr);
        System.out.println(res);
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int a: arr) {
            map.put(a, 1+map.getOrDefault(a,0));
        }
        HashSet<Integer> set = new HashSet<>(map.values());
        return set.size() == map.size();
    }
}
