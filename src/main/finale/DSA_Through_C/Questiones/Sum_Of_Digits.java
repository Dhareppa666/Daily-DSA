package main.finale.DSA_Through_C.Questiones;

public class Sum_Of_Digits {

    public static void main(String[] args) {
        reverse(1234);
        int num = 10803;
        //1. approach
        /*int sum =0;
        while(num > 0){
            int rem = num%10;
            sum += rem;
            num = num/10;
        }
        System.out.println(sum);*/
        //2. recursion
        /*int res = sum(num);
        System.out.println(res);*/

        //Base conversion
        int num2= 161;
        baseConv(num2, 2);
        System.out.println();
        baseConv(num2, 8);
        System.out.println();
        baseConv(num2, 10);
        System.out.println();
        baseConv(num2, 16);
        System.out.println();
    }

    private static int reverse(int i) {
        if(i==0){
            return 0;
        }
        int sum =0;
        while(i == 0){
            int rem = i%10;

        }return 0;

    }

    private static void baseConv(int num, int base) {
        int rem = num %base;
        if(num == 0){
            return;
        }
        baseConv(num/base, base);

        if(rem<10){
            System.out.printf("%d", rem);
        } else {
            System.out.printf("%c", rem-10+'A');
        }

    }

    private static int sum(int i) {
        if(i == 0) {
            return 0;
        }
        return (i%10)+sum(i/10);
    }


}
