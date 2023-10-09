package main.finale.recursion;

public class printArrUsingRec {

    public static void main(String[] args) {
        printArr(new int[]{10,20,30,40}, 0);
    }

    private static void printArr(int[] ints, int i) {
        //Exit Condition
        if(i >= ints.length){
            return;
        }
        //Logic
        System.out.println(ints[i]);

        //recursive call
        printArr(ints, i+1);

    }
}
