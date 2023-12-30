package main.finale.DSA.arrays;

import java.util.ArrayList;

public class Intersection_of_two_arrays {

    public static void main(String args[]) {
        int arr1[]={1,2,3,3,4,5,6,7};
        int arr2[]= {3,3,4,4,5,8};
        ArrayList<Integer> Union = FindIntersection(arr1, arr2, arr1.length, arr2.length);
        System.out.println("Union of arr1 and arr2 is ");
        for (int val: Union)
            System.out.print(val+" ");
    }

    private static ArrayList<Integer> FindIntersection(int[] arr1, int[] arr2, int n, int m) {
        ArrayList<Integer> list = new ArrayList<>();
        int i=0, j=0;
        while(i<n && j<m){
            if(arr1[i]==arr2[j]){
                list.add(arr1[i]);
                i++; j++;
            } else if(arr1[i]<arr2[j]) {
                i++;
            } else{
                j++;
            }
        }
        return list;
    }
}
