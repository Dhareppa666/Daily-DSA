package main.finale.patterns.Problems.Arrays;

public class Longest_Subarray_with_given_Sum_K {

    public static void main(String[] args) {
        int[] arr = {7,1,6,0};
        int n = arr.length, k = 7;

        System.out.println("Length of the longest subarray with sum K is " +
                longestSubArrWithSumK_BF(arr, n, k));
    }

    private static int longestSubArrWithSumK_BF(int[] arr, int n, int k) {
        int max_sum = 0;
        for(int i=0; i<arr.length; i++){
            int new_sum = 0;
            for(int j=i; j<arr.length; j++){
                new_sum+=arr[j];
                if (new_sum==k)
                    max_sum = Math.max(max_sum, (j-i+1));
            }
        }
        return max_sum;
    }

}
