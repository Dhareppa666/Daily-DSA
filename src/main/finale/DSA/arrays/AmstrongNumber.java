package main.finale.DSA.arrays;

public class AmstrongNumber {

    public static void main(String[] args) {
        int n1 = 153;
        if (ArmstrongNumber(n1))
        {
            System.out.println("Yes, it is an Armstrong Number\n");
        }
        else
        {
            System.out.println("No, it is not an Armstrong Number\n");
        }
    }

    //Time Complexity: O(n) where n is the number of digits since we need to traverse every digit and add digits raised to power no. of digits to sum.
    //Space Complexity: O(1) since no extra space is required
    private static boolean ArmstrongNumber(int n) {
        int digits = 0, x = n;
        while(x>0){
            x/=10;
            digits++;
        }
        x = n;
        int sum = 0;
        while(x>0){
            int rem = x%10;
            sum+=(Math.pow(rem, digits));
            x/=10;
        }
        return sum == n;
    }
}
