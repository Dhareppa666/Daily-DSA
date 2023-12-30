package main.finale.DSA.recursion;

import java.util.ArrayList;

public class SubSequence_sum_is_K {

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int sum = 0, n=arr.length;
        int s = 2;
        ArrayList<Integer> list = new ArrayList<>();
        subSeq(0, arr, s, sum, n, list);
    }

    private static void subSeq(int index, int[] arr, int currSum, int sum, int n, ArrayList<Integer> list) {
        if(n==index){
            if(sum==currSum){
                System.out.println(list);
            }
            System.out.println(list);
            return;
        }
        list.add(arr[index]);
        currSum+=arr[index];
        subSeq(index+1, arr, currSum, sum, n, list);

        currSum-=arr[index];
        list.remove(list.size()-1);
        subSeq(index+1, arr, currSum, sum, n , list);
        //list.remove(list.size()-1);
    }
}
