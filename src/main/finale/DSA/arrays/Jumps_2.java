package main.finale.DSA.arrays;

public class Jumps_2 {

    public static void main(String[] args) {
        System.out.println(jump(new int[]{3,1,1,0,1,1}));//-1
        System.out.println(jump(new int[]{3,1,2,0,1,1}));//3
    }

    //[3,1,1,0,1,4]

    public static int jump(int[] nums) {//2,3,1,1,4
        int end=0, farthest = 0;
        int jumps = 0;
        for(int i=0; i<nums.length-1; i++){

            if(farthest < i) {
                return -1;
            }

            farthest = Math.max(farthest, i+nums[i]);

            if(i == end) {
                jumps++;
                end = farthest;
            }
        }
        return jumps;
    }
}
