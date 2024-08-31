package main.finale.leetcode.Daily;

public class _287_Find_the_Duplicate_Number {

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};//[3,3,3,3,3]//3,1,3,4,2
        int dupNumber = findDuplicate(arr);
        System.out.println(dupNumber);
    }

    public static int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);
        slow = 0;

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
}
