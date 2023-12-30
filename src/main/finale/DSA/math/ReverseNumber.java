package main.finale.DSA.math;

public class ReverseNumber {

    public static void main(String[] args) {
        System.out.println(reverse(-123));
        System.out.println(reverse2(-123));
        System.out.println(reverse3(2147483647));
    }

    private static int reverse2(int i) {
        int num = 0;
        int x = (i < 0) ? -1 : 1;
        i = Math.abs(i);
        while (i > 0) {
            int rem = i % 10;
            num = (num * 10) + rem;
            i /= 10;
        }
        return num * x;
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

    public static int reverse3(int x) {
        int result = 0;

        while (x != 0) {
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
