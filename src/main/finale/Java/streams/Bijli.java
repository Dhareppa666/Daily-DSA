package main.finale.Java.streams;

public class Bijli {

    public static void main(String[] args) {
        int result = 0;
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 7, 3};
        for (int i : arr) {
            result ^= i;
        }
        System.out.println("Result is " + result);
    }
}
