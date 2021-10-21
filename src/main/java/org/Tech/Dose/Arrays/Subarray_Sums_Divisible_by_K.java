package org.Tech.Dose.Arrays;

import java.util.HashMap;

//Subarray Sums Divisible by K
public class Subarray_Sums_Divisible_by_K {

    public static void main(String[] args) {
        int[] arr = {4, 5, 0, -2, -3, 1};
        int k = 5;
        System.out.println(subarraysDivByK(arr, k));
    }

    public static int subarraysDivByK(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int rem = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            rem = sum % k;
            if (rem < 0)
                rem += k;
            if (map.containsKey(rem)) {
                ans += map.get(rem);
                map.put(rem, map.get(rem) + 1);
            } else {
                map.put(rem, 1);
            }
        }
        return ans;
    }
}
