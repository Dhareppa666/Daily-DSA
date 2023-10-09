package main.finale.Tech.Dose.Arrays;

public class SubSets {

    public static void main(String[] args) {
        //There are two approaches for this.
        //1. Backtracking Tc-> O(n^2) Sc-> O(n) for extra array subset

        //2. Using Bitmasking. Tc-> O(n*n^2) Sc-> O(n) for extra array subset
        int[] arr = {1,2,3};
        printSubsets2(arr);
        char[] arr2 = {'a', 'b', 'c'};
        printSubsets(arr2);
    }

    private static void printSubsets2(int[] arr) {
        int n= arr.length;
        for(int i=0; i<(1<<n); i++){
            System.out.print("{ ");
            for (int j=0; j<n; j++){
                if((i& (1<<j) )> 0){
                    System.out.print(arr[j]+" ");
                }
            }
            System.out.println("}");
        }
    }

    // Print all subsets of given set[]
    static void printSubsets(char set[]) {
        int n = set.length;
        // Run a loop for printing all 2^n
        // subsets one by one
        for (int i = 0; i < (1 << n); i++) {
            System.out.print("{ ");
            // Print current subset
            for (int j = 0; j < n; j++)
                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
                if ((i & (1 << j)) > 0)
                    System.out.print(set[j] + " ");
            System.out.println("}");
        }
    }
}
