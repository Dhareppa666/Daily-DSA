package main.finale.nextLeap.arrays;

import java.util.Arrays;
import java.util.List;

public class Swap_nums {

    public static void main(String[] args) {
        List<Integer> list = swapNumbers(13, 2);
        list.forEach(x-> System.out.print(x+", "));
    }

    public static List<Integer> swapNumbers(int a, int b) {
        // Your code goes here
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        return Arrays.asList(a,b);
    }
}
