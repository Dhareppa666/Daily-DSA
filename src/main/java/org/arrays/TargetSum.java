package org.arrays;

import java.util.HashSet;

public class TargetSum {

    public static void main(String[] args) {
        int[] a = {5,3,2,7,4,6,1};
        giveRes(a, 8);
    }

    private static void giveRes(int[] arr, int target) {
        HashSet<Integer> map = new HashSet<>();

        for(int i=0; i<arr.length; i++){
            int rem = target - arr[i];
            if(map.contains(rem)){
                System.out.println("["+arr[i]+","+rem+"]");
            }
            map.add(arr[i]);
        }
    }
}
