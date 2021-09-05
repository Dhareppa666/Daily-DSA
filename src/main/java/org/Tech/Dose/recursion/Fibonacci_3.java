package org.Tech.Dose.recursion;

//3. Sum of Elements from 1 to N
public class Fibonacci_3 {

    public static void main(String[] args) {//1,3,6,10,15
        System.out.println("The sum is :" + sum(2));
        System.out.println("The sum is :" + sum(3));
        System.out.println("The sum is :" + sum(4));
        System.out.println("The sum is :" + sum(5));
    }

    private static int sum(int i) {
        if (i == 1) {
            return 1;
        } else {
            return i + sum(i - 1);
        }
    }
}
