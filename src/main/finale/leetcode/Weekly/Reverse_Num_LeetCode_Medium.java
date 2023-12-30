package main.finale.leetcode.Weekly;

public class Reverse_Num_LeetCode_Medium {

    public static void main(String[] args) {
        int res = reverse(112233);
        System.out.println(res);
    }

    public static int reverse(int x)
    {
        int result = 0;

        while (x != 0)
        {
            int rem = x % 10;
            int newResult = result * 10 + rem;
            if ((newResult - rem) / 10 != result) {
                return 0;
            }
            result = newResult;
            x = x / 10;
        }

        return result;
    }
}
