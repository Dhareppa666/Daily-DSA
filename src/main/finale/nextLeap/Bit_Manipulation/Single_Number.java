package main.finale.nextLeap.Bit_Manipulation;

public class Single_Number {

    public static void main(String[] args) {
        int x = singleNumber(new int[]{4,1,2,1,2});
        System.out.println(x);
    }

    public static int singleNumber(int[] nums) {
        // Your code goes here
        int res = 0;
        for(int x: nums) {
            res ^= x;
        }
        return res;
    }
}
