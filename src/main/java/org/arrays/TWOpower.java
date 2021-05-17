package org.arrays;

public class TWOpower {

    public static void main(String[] args) {
        System.out.println("digit is : " + call(13));
    }

    private static int call(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res = res * 2 ;
        }
        System.out.println(res);
        int x = 0;
        while(res > 0){
            int rem = res %10;
            x+= rem;
            res = res/10;
            if(res <= 0 && x>9){
                res = x;
                x= 0;
            }
        }
        return x;
    }
}
