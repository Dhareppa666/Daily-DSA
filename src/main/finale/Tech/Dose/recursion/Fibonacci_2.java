package main.finale.Tech.Dose.recursion;

public class Fibonacci_2 {

    public static void main(String[] args) {//0,1,1,2,3,5,8,13,21
        int n = 8;
        int first = 0, second = 1;
        System.out.print("Fibonacci Series: " + first + "," + second + ",");
        for (int i = 0; i <= n-2; i++) {
            int next = first + second;
            first = second;
            second = next;
            System.out.print(next + ",");
        }
    }
}
