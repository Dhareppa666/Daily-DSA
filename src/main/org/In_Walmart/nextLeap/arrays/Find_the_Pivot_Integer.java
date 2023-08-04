package org.In_Walmart.nextLeap.arrays;

// TODO: Try to execute this.
public class Find_the_Pivot_Integer {

    public static void main(String[] args) {
        int pivot = pivotInteger(8);
        System.out.println(pivot);
    }

    public static int pivotInteger(int n) {
        int l = 1;
        int r = n;
        int totalSum = (n * (n + 1)) / 2;
        while (l <= r) {
            int mid = (l + r) / 2;
            int left = (mid * (mid + 1)) / 2;
            int right = totalSum - left + mid;
            if (left == right) {
                return mid;
            } else if (left < right) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
