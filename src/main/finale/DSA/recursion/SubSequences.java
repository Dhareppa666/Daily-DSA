package main.finale.DSA.recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSequences {

    private static int[] arr = {1,2,3};

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        subSequences(0, arr, list);
    }

    private static void subSequences(int index, int[] arr, ArrayList<Integer> list){
        if(index>=arr.length){
            System.out.println(list);
            return;
        }
        // Subsequence without including the element at current index
        subSequences(index+1, arr, list);

        list.add(arr[index]);

        // Subsequence including the element at current index
        subSequences(index+1, arr, list);

        // Backtrack to remove the recently inserted element
        list.remove(list.size()-1);
    }
}
