package com.org.Arrays;

class MaxConsecutiveOnes {

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 1, 1, 0, 0, 0, 1, 1, 1, 1}));
    }

    private static int findMaxConsecutiveOnes(int[] nums) {
        int current = 0;
        int finali = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (current >= finali) {
                    finali++;
                }
                current++;
            } else {
                current = 0;
            }
        }
        return finali;

    }
}