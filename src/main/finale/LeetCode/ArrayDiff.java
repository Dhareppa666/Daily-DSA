package main.finale.LeetCode;

public class ArrayDiff {

    public static void main(String[] args) {
        int x = findTheDistanceValue(new int[]{4, 5, 8}, new int[]{10, 9, 1, 8}, 2);
        System.out.println(x);
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res = 0;
        for (int i = 0; i < arr1.length; i++) {
            boolean flag = false;
            int i1 = (arr1[i] < 0) ? -arr1[i] : arr1[i];
            for (int j = 0; j < arr2.length; j++) {
                int i2 = (arr2[j] < 0) ? -arr2[j] : arr2[j];
                if ((i1 - i2) <= d) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                res++;
            }
        }
        return res;
    }
}
