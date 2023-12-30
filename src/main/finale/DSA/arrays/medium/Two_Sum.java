package main.finale.DSA.arrays.medium;

import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

    public static void main(String[] args) {
        int[] res = twoSum(new int[]{2,7,11,15}, 9);
        System.out.println(res[0] + ", "+res[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(target-nums[i])) {
                return new int[]{i, map.get(target-nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[]{-1,-1};
    }
}
