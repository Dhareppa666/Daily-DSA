package main.finale.In_Walmart.nextLeap.Bit_Manipulation;

import java.util.Arrays;

public class Counting_Bits {

    public static void main(String[] args) {
        int[] res = countBits(8);
        System.out.println(Arrays.toString(res));
    }

    public static int[] countBits(int n) {
        int[] res = new int[n+1];
        for(int i=0; i<=n; i++) {
            res[i] = getCountOfBits(i);
        }
        return res;
    }

    //#1
    public static int getCountOfBits(int n) {
        int count = 0;
        int x = 1;
        while (x<=32) {
            if(((1<<x)&n) >0){
                count++;
            }
            x++;
        }
        return count;
    }

    //#2
    private static int popCount(int x) {
        int count;
        for (count = 0; x != 0; ++count) {
            x &= x - 1; // zeroing out the least significant nonzero bit
        }
        return count;
    }
}
