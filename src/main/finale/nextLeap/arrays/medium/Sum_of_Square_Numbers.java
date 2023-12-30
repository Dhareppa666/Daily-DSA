package main.finale.nextLeap.arrays.medium;

public class Sum_of_Square_Numbers {

    public static void main(String[] args) {
        boolean res = judgeSquareSum(5);
        System.out.println(res);
    }

    public static boolean judgeSquareSum(int c) {
        int left = 0, right = (int) Math.sqrt(c);
        while(left<=right) {
            int res = left * left + right * right;
            if(res == c) {
                System.out.println("the nums are: "+left+","+right);
                return true;
            } else if (res < c) {
                left++;
            } else {
                right--;
            }
        }
        return false;
    }
}
