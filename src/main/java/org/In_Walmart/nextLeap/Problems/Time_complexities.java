package org.In_Walmart.nextLeap.Problems;

public class Time_complexities {

    private static int counter = 0;

    public static void main(String[] args) {
        sum(10);
        System.out.println(counter);
        System.out.println((int)Math.pow(2, 10));//O(2^n)
    }

    public static void sum(int n) {
        counter++;
        if(n<1){
            return;
        }
        sum(n-1);
        sum(n-1);
    }
}
