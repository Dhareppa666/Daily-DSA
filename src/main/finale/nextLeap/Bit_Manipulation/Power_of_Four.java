package main.finale.nextLeap.Bit_Manipulation;

public class Power_of_Four {

    public static void main(String[] args) {
        boolean res =  isPowerOfFour(16);
        System.out.println(res);
    }

    public static boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }else if(n==1) {
            return true;
        } else if (n%4 !=0) {
            return false;
        } else {
            return isPowerOfFour(n/4);
        }
    }
}
