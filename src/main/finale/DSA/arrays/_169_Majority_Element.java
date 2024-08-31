package main.finale.DSA.arrays;

public class _169_Majority_Element {

    public static void main(String[] args) {
        int majorityElement = majorityElement(new int[]{3, 2, 3, 2, 5, 3});
        System.out.println(majorityElement);
    }

    public static int majorityElement(int[] nums) {
        int last = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == last)
                count++;
            else
                count--;
            if (count == 0) {
                last = nums[i];
                count++;
            }
        }
        return last;
    }
}
