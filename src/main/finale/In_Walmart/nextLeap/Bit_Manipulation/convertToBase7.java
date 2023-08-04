package org.In_Walmart.nextLeap.Bit_Manipulation;

public class convertToBase7 {

    public static void main(String[] args) {
        convertToBase77(-7);//10
    }

    public static String convertToBase7(int num) {
        if(num == 0)
            return "0";
        StringBuilder ans = new StringBuilder();
        boolean neg = num < 0;
        num = Math.abs(num);
        while(num != 0){
            ans.append(num%7);
            num = num/7;
        }
        if(neg)
            ans.append('-');
        return ans.reverse().toString();
    }

    public static String convertToBase77(int num) {
        // Your code goes here
        int res = 1;
        boolean isNegativeNum = num<0;
        num = Math.abs(num);
        while(num!=0) {
            int rem = num % 7;
            res = res * 10 + rem;
            num = num /7;
        }
        return isNegativeNum ? "-"+String.valueOf(res) : String.valueOf(res);
    }
}
