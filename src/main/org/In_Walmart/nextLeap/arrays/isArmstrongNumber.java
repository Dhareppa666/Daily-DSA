package org.In_Walmart.nextLeap.arrays;


public class isArmstrongNumber {

    public static void main(String[] args) {
        //0, 1, 153, 370, 371 and 407
        System.out.println(isAmNumber(371));
    }

    public static boolean isAmNumber(int n) {
        int length = String.valueOf(n).length();
        int sum = 0, org = n;
        while (n>0) {
            int rem = n %10;
            sum += Math.pow(rem, length);
            n= n/10;
        }
        return sum == org;
    }
}
