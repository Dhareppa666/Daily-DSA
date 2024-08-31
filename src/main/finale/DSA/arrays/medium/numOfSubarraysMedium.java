package main.finale.DSA.arrays.medium;

// https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/
// 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
public class numOfSubarraysMedium {

    public static void main(String[] args) {
        int res = numOfSubarrays(new int[]{2, 2, 2, 2, 5, 5, 5, 8}, 3, 4);
        System.out.println(res);
    }

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0, res = 0;
        for (int i = 1; i <= k; i++) {
            sum += arr[i - 1];
        }
        int idx = 0;

        if (sum / k >= threshold) {
            res++;
        }
        for (int i = k; i < arr.length; i++) {
            sum = sum + arr[i] - arr[idx] ;
            if (sum / k >= threshold) {
                res++;
            }
            idx++;
        }
        return res;
    }
}
