package main.finale.leetcode.Blind_75;

import java.util.Arrays;

//https://leetcode.com/problems/boats-to-save-people/description/?envType=daily-question&envId=2024-05-04
public class _881_Boats_to_Save_People {

    public static void main(String[] args) {
        int[] people = {3, 2, 2, 1};
        int limit = 3;
        int boats = numRescueBoats(people, limit);
        System.out.println("Min number of boats are required: " + boats);
    }

    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int boats = 0;
        int l = 0, r = people.length - 1;

        while (l <= r) {
            if (people[l] + people[r] <= limit) {
                l++;
            }
            r--;
            boats++;
        }

        return boats;
    }
}

