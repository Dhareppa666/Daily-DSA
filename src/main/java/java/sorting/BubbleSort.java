package java.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {20, 10, 30, 320, 40, 60, 100, 15, 250, 50, 76};
        int[] arrResult = bubbleSort(arr);
        for (int i:arrResult) {
            System.out.print(i+":");
        }
    }

    private static int[] bubbleSort(int[] arr) {
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < length-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
        return arr;
    }
}
