package main.finale.In_Walmart.nextLeap.arrays;

public class PalindromesOfANumber {

    public static void main(String[] args) {
        System.out.println(isPalindrome(12331));
    }

    private static boolean isPalindrome(int n) {
        int rev = 0, num = n;
        while(num>0) {
            int rem = num%10;
            rev = rev * 10 + rem;
            num /=10;
        }
        return rev == n;
    }

}
