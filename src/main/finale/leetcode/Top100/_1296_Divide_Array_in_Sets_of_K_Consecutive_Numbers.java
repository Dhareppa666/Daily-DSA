package main.finale.leetcode.Top100;

import java.util.Map;
import java.util.TreeMap;

public class _1296_Divide_Array_in_Sets_of_K_Consecutive_Numbers {

    public static void main(String[] args) {
        int[] nums = {3,3,2,2,1,1};
        int k = 3;
        boolean res = isPossibleDivide(nums, k);
        System.out.println(res);
    }

    public static boolean isPossibleDivide(int[] nums, int k) {
        TreeMap<Integer, Integer> countMap = new TreeMap<>();
        for (int card : nums) {
            countMap.put(card, countMap.getOrDefault(card, 0) + 1);
        }

        int count = nums.length;
        while(count>0) {
            int firstKey = countMap.firstKey();
            if (countMap.get(firstKey) != 0) {
                for (int i = 0; i < k; i++) {
                    if (countMap.getOrDefault(i + firstKey, 0) == 0) {
                        return false;
                    } else {
                        countMap.put(firstKey + i, countMap.get(firstKey + i) - 1);
                        count--;
                    }
                }
            } else {
                countMap.remove(firstKey);
//                count--;
            }
        }
        return true;
    }
}
