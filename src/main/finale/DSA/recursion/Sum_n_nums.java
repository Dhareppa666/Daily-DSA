package main.finale.DSA.recursion;

public class Sum_n_nums {

    public static void main(String[] args) {
        sum(5, 0);
        System.out.println("the sum2 is: "+sum2(5));
        System.out.println(1/2);
        int x = 1;
        int y=2;
        System.out.println((Integer)x/y);
    }

    private static int sum2(int i) {
        if (i==0){
            return i;
        }
        return i+sum2(i-1);
    }

    private static void sum(int n, int sum) {
        if(n<1){
            System.out.println("The sum is : "+sum);
            return;
        }
        sum(n-1, sum+n);
    }
}
