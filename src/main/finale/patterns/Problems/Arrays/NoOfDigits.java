package org.patterns.Problems.Arrays;

public class NoOfDigits {
    public static void main(String args[])
    {
        int n = 123456;
        System.out.println("Number of digits in "+n+" is "+count_digits3(n));
    }
    static int count_digits(int n)
    {
        int digits = (int) Math.floor(Math.log10(n) + 1);
        return digits;
    }

    static int count_digits2(int n)
    {
        String digits = String.valueOf(n);
        return digits.length();
    }

    static int count_digits3(int n)
    {
        int counter = 0, x = n;
        while(x>0){
            x/=10;
            counter++;
        }
        return counter;
    }


}
