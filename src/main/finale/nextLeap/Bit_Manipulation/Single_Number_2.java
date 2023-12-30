package main.finale.nextLeap.Bit_Manipulation;

public class Single_Number_2 {

    public static void main(String[] args) {
        int x = singleNumber2(new int[]{2,2,3,2,3, 3,7});
        System.out.println(x);
    }

    public static int singleNumber2(int[] nums) {
        int ans = 0;
        for(int i = 0; i < 32; i++) {
            int sum = 0;
            for(int j = 0; j < nums.length; j++) {
                if(((nums[j] >> i) & 1) == 1) {
                    sum++;
                }
            }
            if(sum%3 >0) {
                ans = ans | (1<<i);
            }
        }
        return ans;
    }
}
