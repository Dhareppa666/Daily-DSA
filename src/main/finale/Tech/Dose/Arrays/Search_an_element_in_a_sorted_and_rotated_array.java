package main.finale.Tech.Dose.Arrays;

//https://www.geeksfmain.finaleeeks.main.finale/search-an-element-in-a-sorted-and-pivoted-array/
public class Search_an_element_in_a_sorted_and_rotated_array {

    public static void main(String args[]) {
//        int[] arr = {1,0,1,1,1};
        int[] arr = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        int n = arr.length;
        int key = 6;
        int i = search(arr, 0, n - 1, key);
        if (i != -1)
            System.out.println("Index: " + i);
        else
            System.out.println("Key not found");
    }

    // Returns index of key in arr[l..h] if key is present, otherwise returns -1
    public static int search(int[] arr, int l, int h, int key) {
        if (l > h)
            return -1;

        int mid = l + (h - l) / 2;
        if (arr[mid] == key)
            return mid;

        // If arr[l...mid] first subarray is sorted.
        if (arr[l] <= arr[mid]) {
            // As this subarray is sorted, we can quickly check if key lies in half or other half.
            if (key >= arr[l] && key <= arr[mid])
                return search(arr, l, mid - 1, key);
            //If key not lies in first half subarray, Divide other half  into two subarrays,
            //such that we can quickly check if key lies in other half.
            return search(arr, mid + 1, h, key);
        }

        // If arr[l..mid] first subarray is not sorted, then arr[mid... h] must be sorted subarray
        if (key >= arr[mid] && key <= arr[h])
            return search(arr, mid + 1, h, key);
        else
            return search(arr, l, mid - 1, key);
    }

    public boolean search(int[] nums, int target) {
        int start = 0, end = nums.length-1;
        while(start <= end) {
            int mid = start+ (end-start) / 2;
            if (nums[mid] == target) {
                return true;
            }
            if(nums[start] == nums[mid] && nums[mid] == nums[end]){
                start++;
                end--;
                continue;
            }
            if(nums[start]<=nums[mid]) {
                if(target >= nums[start] && target <= nums[mid]) {
                    end=mid-1;
                } else {
                    start = mid+1;
                }
            } else {
                if(target >= nums[mid] && target <= nums[end]) {
                    start = mid +1;
                } else {
                    end = mid-1;
                }
            }
        }
        return false;
    }
}
