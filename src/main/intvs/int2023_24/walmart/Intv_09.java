package main.intvs.int2023_24.walmart;

import java.util.*;

public class Intv_09 {

    //31. Next Permutation
    //https://leetcode.com/problems/next-permutation/
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] input = {2,3,1};
        int right = input.length-1;
        boolean isSwap = false;
        while(!isSwap) {
            if(input[right] > input[right-1]) {
                isSwap = true;
                swapArray(right-1, input);
            }
            right--;
        }
        System.out.println(Arrays.toString(input));
    }

    public static void swapArray(int position, int[] input) {
        int temp = input[position]; // 10
        for(int index = position ; position<input.length-1; index++) {
            input[index] = input[index+1];
        }
        input[input.length-1] = temp;

    }
}
