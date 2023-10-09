package main.finale.patterns.Problems.Arrays;

import java.util.Arrays;

public class Remove_Duplicates_from_sorted_array {

        public static void main(String[] args) {
            System.out.println(Arrays.toString(check(new int[]{1,1,1,2,2,2,2,2,2,3,3,3,3,4,5,6,6,6,7})));
            System.out.println(Arrays.toString(check(new int[]{1,1,1,2,7})));
        }

        public static int[] check(int[] arr) {
            int index = 0;
            for (int i = 1; i < arr.length; ++i) {
                if(arr[i]!=arr[index]){
                    arr[++index] = arr[i];
                }
            }
            for(int j=index+1; j<arr.length; j++){
                arr[j] = -1;
            }
            return arr;
        }
    }

