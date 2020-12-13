package java.arrays;

class duplicateZeros {

    public static void main(String[] args) {
        //duplicateZeros(new int[]{1, 2, 3, 0, 4, 5, 6, 7});
        duplicateZeros(new int[]{1, 0, 2, 3, 0, 4, 5, 0});
    }

    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j-1];
                }
                i++; // we don't want to traverse over the duplicate zero
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }

}