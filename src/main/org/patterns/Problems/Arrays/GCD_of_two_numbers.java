package org.patterns.Problems.Arrays;

public class GCD_of_two_numbers {

    public static void main(String[] args) {
        int res = GCDof2Nums(3,6);
        System.out.println("the res is: "+res);

        int res2 = GCDof2Nums2(9,26);
        System.out.println("the res is: "+res2);
    }

    // Brute Force O(n)
    private static int GCDof2Nums2(int a, int b) {
        int res =1;
        for(int i=2; i<=Math.min(a,b); i++){
            if(a%i==0&& b%i==0)
                res = i;
        }
        return res;
    }

    // TC: log min(a,b)
    // Using Euclidean’s theorem.
    //  gcd(a, b) = gcd(b, a%b);
    private static int GCDof2Nums(int a, int b) {
        if(b==0){
            return a;
        }
        return GCDof2Nums(b, a%b);
    }
}
