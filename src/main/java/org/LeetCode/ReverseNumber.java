package org.LeetCode;

public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }

    public static int reverse(int x) {
        if (x == Integer.MIN_VALUE) {
            return 0;
        }
        int isNeg = (x < 0) ? -1 : 1;
        x = (x < 0) ? -x : x;
        int res = 0;
        while (x != 0) {
            int rem = x % 10;
            int newRes = res * 10 + rem;
            if (res != (newRes - rem) / 10) {
                res = 0;
                break;
            }
            res = newRes;
            x = x / 10;
        }
        return res * isNeg;
    }
}
