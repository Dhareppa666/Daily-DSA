package main.finale.DSA.arrays;

import java.util.Arrays;

public class Rotate_arr_By_K_elements {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotateArr(new int[]{1,2,3,4,5,6,7}, 1)));//right
        System.out.println(Arrays.toString(rotateArr2(new int[]{1,2,3,4,5,6,7}, 1)));//left

        rotateMedium(new int[]{1,2,3,4,5,6,7}, 1);//right. Leedcode medium
    }

    public static int[] rotateArr(int[] arr, int k) {
        while(k!=0){
            int temp = arr[0];
            for(int i=0; i<arr.length-1; i++){
                arr[i] = arr[i+1];
            }
            arr[arr.length-1] = temp;
            k--;
        }
        return arr;
    }

    public static int[] rotateArr2(int[] arr, int k) {
        while(k!=0){
            int temp = arr[arr.length-1];
            for(int i=arr.length-1; i>0; i--){
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
            k--;
        }
        return arr;
    }

    public static void rotateMedium(int[] nums, int k) {
        k = k%nums.length;
        rotate(nums, 0, nums.length-1);
        rotate(nums, 0, k-1);
        rotate(nums, k, nums.length-1);
    }

    public static void rotate(int[] arr, int l, int r){
        while(l<r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++; r--;
        }
    }
}
