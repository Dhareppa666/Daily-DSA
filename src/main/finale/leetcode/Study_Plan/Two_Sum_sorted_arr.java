package main.finale.leetcode.Study_Plan;
// 167. https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class Two_Sum_sorted_arr {

    public static void main(String[] args) {
        // numbers = [2,7,11,15], target = 9
    }

    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int i=0, j=numbers.length-1;
        while(i<j){
            int sum = numbers[i] + numbers[j];
            if(sum == target)
                return new int[]{i+1, j+1};
            else if (sum > target)
                j--;
            else
                i++;
        }
        return res;
    }
}
