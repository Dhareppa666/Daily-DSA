package org.arrays;

class test {

    public static void main(String[] args) {
        //duplicateZeros(new int[]{1, 2, 3, 0, 4, 5, 6, 7});
        duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0, 7 ,8});
        //                       1, 0, 0,
        //duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0});
    }

    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0 && i < n - 1) {
                arr2[i] = 0;
                arr2[i + 1] = 0;
                for(int j = n-1; j>=(i+2); j--){
                    arr[j] = arr[j-1];
                }
                i++;
            } else {
                arr2[i] = arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr2[i] + ", ");
        }
    }
}