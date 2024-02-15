package main.finale.leetcode.Daily;

//https://leetcode.com/problems/number-of-subarrays-that-match-a-pattern-i/
public class _3034_Number_of_Subarrays_That_Match_a_Pattern_I {

    public static void main(String[] args) {

    }

    public static int countMatchingSubarrays(int[] nums, int[] pattern) {
        int res = 0;
        int subArrLength = pattern.length + 1; //4
        for (int i = 0; i <= nums.length - subArrLength; i++) { //0 to 4
            int patIndex = 0;
            boolean isExist = true;
            for (int j = i; j < i + subArrLength - 1; j++) {
                if (pattern[patIndex] == 0 && nums[j] != nums[j + 1]) {
                    isExist = false;
                    break;
                } else if (pattern[patIndex] == 1 && nums[j] >= nums[j + 1]) {
                    isExist = false;
                    break;
                } else if (pattern[patIndex] == -1 && nums[j] <= nums[j + 1]) {
                    isExist = false;
                    break;
                }
                patIndex++;
            }
            if (isExist) {
                res++;
            }
        }
        return res;
    }
}
