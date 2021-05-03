package org.arrays;

public class FindDuplicateArrays {
    public static void main(String[] args) {
        String[] arr = {"ABC", "DEF", "XYZ", "VERIFONE", "VERIFONE", "ABC"};
        System.out.println("********Brute Force Mathod*******");
        for (int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++){
                if(arr[i].equals(arr[j])){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
