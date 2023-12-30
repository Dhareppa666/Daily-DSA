package main.finale.nextLeap.arrays;

public class Maximum_Subarray {

    public static void main(String[] args) {
        int res = maxSubArray2(new int[]{5,4,-1,7,4});
        System.out.println(res);
    }

    public static int maxSubArray(int[] nums) {
        int sum = Integer.MIN_VALUE;
        int bag = 0;
        for(int i=0; i<nums.length; i++) {
            bag+=nums[i];
            if(bag>sum) {
                sum = bag;
            }
            if(bag < 0 ) {
                bag = 0;
            }
        }
        return sum;
    }

    public static int maxSubArray2(int[] nums) {
        int sum = 0, max = 0;
        for(int i=0; i<nums.length; i++) {
            sum+=nums[i];
            max = Math.max(max, sum);
            if(sum < 0 ) {
                sum = 0;
            }
        }
        return sum;
    }
}
