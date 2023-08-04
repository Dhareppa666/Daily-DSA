package org.In_Walmart.nextLeap.arrays.medium;

import java.util.*;

public class Three_Sum {

    public static void main(String[] args) {
        List<List<Integer>> res = get3Sum(new int[]{-1,0,1,2,-1,-4});
        System.out.println(res);
    }

    public static List<List<Integer>> get3Sum(int[] arr) {
        Set<List<Integer>> res = new HashSet<>();
        if(arr.length <3) {
            return new ArrayList<>(res);
        }
        Arrays.sort(arr);
        for (int i=0; i<arr.length -2; i++) {
            int j = i+1, k = arr.length -1;
            while (j<k) {
                int sum = arr[i] + arr[j] + arr[k] ;
                if(sum ==0) {
                    res.add(Arrays.asList(arr[i], arr[j++], arr[k--]));
                } else if(sum <0 ) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return new ArrayList<>(res);
    }
}
