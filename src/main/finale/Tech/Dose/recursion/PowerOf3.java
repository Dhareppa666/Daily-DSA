package main.finale.Tech.Dose.recursion;

public class PowerOf3 {

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(34));
        System.out.println(isPowerOfFour(8));
        System.out.println(isPowerOfFour(27));
    }

    private static boolean isPowerOfFour(int n) {
        if(n==1)
            return true;
        if (n%3!=0 || n<3)
            return false;
        return isPowerOfFour(n/3);
    }
}
