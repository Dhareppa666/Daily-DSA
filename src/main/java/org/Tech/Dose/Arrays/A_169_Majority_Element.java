package org.Tech.Dose.Arrays;

public class A_169_Majority_Element {

    public static void main(String[] args) {
        int majorityElement = majorityElement(new int[]{3, 4, 2, 3, 2, 5, 3, 4});
        System.out.println(majorityElement);
    }

    public static int majorityElement(int[] nums) {
        int max = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == max)
                count++;
            else
                count--;
            if (count == 0) {
                max = nums[i];
                count++;
            }
        }
        return max;
    }
}
