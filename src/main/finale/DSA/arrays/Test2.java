package main.finale.DSA.arrays;

public class Test2 {

    public static void main(String[] args) {
        call(new int[]{1, 2, 3, 4, 5});
    }

    private static void call(int[] arr) {
        int n = arr.length;
        int res = 0;
        //starting pos
        for (int i = 0; i < n; i++) {
            //Ending position.
            for(int j=i; j<n; j++){

                System.out.print("[");
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+ ",");
                }
                System.out.print("]");
                res++;
                System.out.println();
            }
        }
        System.out.println("Total no of Combitions are : "+res);
    }
}
