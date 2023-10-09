package main.finale.In_Walmart.nextLeap.arrays.medium;

// https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/
// 1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
public class numOfSubarraysMedium {

    public static void main(String[] args) {
        int res = numOfSubarrays(new int[]{2,2,2,2,5,5,5,8}, 3, 4);
        System.out.println(res);
    }

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int res = 0;
        int sum = 0;
        for(int i=0; i<k; i++) {
            sum+=arr[i];
        }
        for(int i=0; i<arr.length-k+1; i++) {
            if(i!=0) {
                sum = sum - (arr[i-1]) + (arr[i+k-1]) ;
            }
            if(sum / k >= threshold){
                res++;
            }
        }
        return res;
    }
}
