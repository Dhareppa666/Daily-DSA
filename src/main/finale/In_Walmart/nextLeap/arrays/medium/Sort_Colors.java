package main.finale.In_Walmart.nextLeap.arrays.medium;

import static main.finale.In_Walmart.nextLeap.arrays.Main.PrintArray;

public class Sort_Colors {

    public static void main(String[] args) {
        int[] arr = {2,0,2,1,0,1,0};
        sortColors(arr);
        PrintArray(arr);
    }

    public static void sortColors(int[] nums) {
        int first =0, mid = 0, last = nums.length-1;
        while(mid <= last){
            switch(nums[mid]){
                case 0:
                    int temp =  nums[mid];
                    nums[mid] = nums[first];
                    nums[first] = temp;
                    mid++;
                    first++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp2 = nums[last];
                    nums[last] = nums[mid];
                    nums[mid] = temp2;
                    last--;
                    break;
            }
        }
    }
}
