package main.finale.In_Walmart.nextLeap.arrays;

public class Single_Number {

    public static void main(String[] args) {
        int res = singleNumber(new int[]{1,1,2,3,4,3,2});
        System.out.println(res);
    }

    public static int singleNumber(int[] arr) {
        int a = 0;
        for(int x: arr) {
            a ^= x;
        }
        return a;
    }
}
