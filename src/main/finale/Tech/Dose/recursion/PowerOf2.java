package main.finale.Tech.Dose.recursion;

public class PowerOf2 {

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
        System.out.println(isPowerOfFour(7));
    }

    private static boolean isPowerOfFour(int n) {
        if(n==1)
            return true;
        if (n%2!=0 || n<2)
            return false;
        return isPowerOfFour(n/2);
    }
}
