package main.finale.In_Walmart.nextLeap.arrays;

import java.util.Arrays;

// Input: nums = [2,5,1,3,4,7], n = 3
// Output: [2,3,5,4,1,7]
// Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
public class Shuffle_the_Array {

    public static void main(String[] args) {
        int[] res = shuffle(new int[]{2,5,1,3,4,7}, 3);
        System.out.println(Arrays.toString(res));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int it = 0;
        for(int i=0; i<nums.length/2; i++) {
            res[it++] = nums[i];
            res[it++] = nums[ (i+n) % nums.length];
        }
        return res;
    }
}
