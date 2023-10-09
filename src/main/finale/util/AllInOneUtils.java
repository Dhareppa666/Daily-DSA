package main.finale.util;

public class AllInOneUtils {

    public static void printArr(int[] arr){
        System.out.println("-------------In Array Printing-------------------");
        for (int index=0; index <arr.length; index++){
            System.out.print(arr[index]+",");
        }
        System.out.println();
        System.out.println("-------------In Array Printing-------------------");
    }

    public static void printArr(String[] arr){
        for (int index=0; index <arr.length; index++){
            System.out.print(arr[index]+",");
        }
        System.out.println();
    }
}
