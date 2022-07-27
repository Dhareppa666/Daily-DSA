package org.gfg;

import java.util.HashSet;
import java.util.Set;

public class abc {

    public static void main(String[] args) {
//        int[] arr = {557, 217, 627, 358, 527, 358, 338, 272, 870, 362, 897, 23, 618, 113, 718, 697, 586, 42,
//                424, 130, 230, 566, 560, 933
//        };

        int[] arr = {10,20,30,40,50};

        //System.out.println(find3Numbers(arr, arr.length, 986));
        System.out.println(find3Numbers2(arr, arr.length, 60));
    }

    public static boolean find3Numbers(int A[], int n, int X) {
        boolean res = false;
        int x = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((A[x] + A[i] + A[j]) == X) {
                    return true;
                }
            }
            x++;
        }
        return res;
    }

    public static boolean find3Numbers2(int A[], int n, int sum) {
        boolean res = false;
        for (int i = 1; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();
            int curr_sum = sum-A[i];
            for(int j=0; j<n; j++){
                if(set.contains(curr_sum-A[j])){
                    System.out.println("Triplets are : "+A[i]+"-"+A[j]+"-"+(curr_sum-A[j]));
                    return true;
                }
                set.add(A[j]);
            }
        }
        return res;
    }
}
