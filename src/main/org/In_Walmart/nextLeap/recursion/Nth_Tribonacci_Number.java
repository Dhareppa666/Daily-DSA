package org.In_Walmart.nextLeap.recursion;

public class Nth_Tribonacci_Number {

    public static void main(String[] args) {
        int res = tribonacci(4);
        System.out.println(res);
    }

    public static int tribonacci(int n) {
        if(n<2) {
            return n;
        } else if (n<3){
            return 1;
        }
        int a = 0, b= 1, c = 1, d = 0;
        while(n-- > 2) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return d;
    }
}
