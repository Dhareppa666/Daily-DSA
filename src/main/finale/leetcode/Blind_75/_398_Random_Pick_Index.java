package main.finale.leetcode.Blind_75;

import java.util.*;

public class _398_Random_Pick_Index {

    private Map<Integer, List<Integer>> indices = new HashMap<>();
    private Random random;

    public _398_Random_Pick_Index(int[] nums) {
        random = new Random();
        for (int i = 0; i < nums.length; i++) {
            if (!indices.containsKey(nums[i])) {
                indices.put(nums[i], new ArrayList<>());
            }
            indices.get(nums[i]).add(i);
        }
    }

    public int pick(int target) {

        if (indices.containsKey(target)) {
            List<Integer> targetIndices = indices.get(target);
            int radomIndex = random.nextInt(targetIndices.size());
            return targetIndices.get(radomIndex);
        }
        return -1;
    }

    public static void main(String[] args) {
        _398_Random_Pick_Index obj = new _398_Random_Pick_Index(new int[]{1, 2, 3, 3, 3});
        System.out.println(obj.pick(3));
        System.out.println(obj.pick(3));
        System.out.println(obj.pick(3));
        System.out.println(obj.pick(3));
        System.out.println(obj.pick(3));
        System.out.println(obj.pick(3));
        System.out.println(obj.pick(3));
        System.out.println(obj.pick(3));
        System.out.println(obj.pick(3));
    }

}


