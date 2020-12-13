package java.searching;

public class Binary_Search {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60};
        int index = searchKey(arr, 40);
        if (index != -1) {
            System.out.println("key is at Index: " + index);
        } else {
            System.out.println("key is not present in the given array");
        }
    }

    private static int searchKey(int[] arr, int key) {
        int index = -1;
        int start = 0;
        int end = arr.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {
            if (arr[mid] < key) {
                start = mid + 1;
            } else if (key == arr[mid]) {
                index = mid;
                break;
            } else {
                end = mid - 1;
            }
            mid = (start + end) / 2;
        }
        return index;
    }
}
