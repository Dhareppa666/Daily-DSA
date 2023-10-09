package main.finale.In_Walmart.nextLeap.arrays;

public class Second_Largest_Element {

    public static void main(String[] args) {
        int secLargeEle = secondLargest(new int[]{5, 1, 4, 6, 6, 6, 5});
        System.out.println(secLargeEle);
    }

    public static int secondLargest(int[] nums) {
        // Your code goes here
        int max = Integer.MIN_VALUE, secMax = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int curr = nums[i];
            if(max < curr ){
                secMax = max;
                max = curr;
            } else if (secMax < curr && curr != max) {
                secMax = curr;
            }
        }
        return secMax;
    }
}
